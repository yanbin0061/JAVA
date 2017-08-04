package com.cacheserverdeploy.deploy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.concurrent.ArrayBlockingQueue;

public class Deploy
{
	private static final int MAX_NET_NODE = 1000;// max number of net node
	private static final int MAX_LINK_NODE_NODE = 20;// max number of chain in a node
	private static final int MAX_CONSUME_NODE=500;// max number of consume node
	private static final int MAX_LINK_COST = 100;// max number of cost of one unit net 
	private static final int MIN_LINK_COST = 0;// min number of cost of one unit net
	private static final int MAX_CAPACITY = 100;// max number of chain capacity
	private static final int MIN_CAPACITY =0;// min number of chain capacity
	private static final int MAX_CONSUME_NEED =5000;// max number of consume need of consume node
	private static final int MIN_CONSUME_NEED =0;//min number of consume need of consume node
	private static final int MAX_COST_SERVER = 5000;// max number of server cost
	private static final int MIN_COST_SERVER = 0;// min number of server cost
	private static final int MAX_NET_PATH_COUNT = 50000;// max number of net path
	private static final int MAX_NODE_LINE_COUNT = 1000;// max number of node in one net path
    /**
     * 你需要完成的入口
     * <功能详细描述>
     * @param graphContent 用例信息文件
     * @return [参数说明] 输出结果信息
     * @see [类、类#方法、类#成员]
     */
    public static String[] deployServer(String[] graphContent)
    {
    	NetGraph graph = createNetGraph(graphContent);
		
        /**do your work here**/
        return new String[]{"17","\r\n","0 8 0 20"};
    }

    //创建网络图，并存储
    private static NetGraph createNetGraph( String[] graphContent){
    	int netNodeCount =0, chainCount=0, consumeNodeCount=0, blankLineCount=0, costOfServer=0;
		int sourceNode, destNode, sumCapacity, costUnit, consumeNode, connectNode, consumeNeed;
		int tempCount=0, index=0;
		String[] temp ;
		String tempLine=null;
		NetGraph netGraph = null;
		AdjLink tempLink = null;
		NetNode[] connectToConsumeNode = null;
		Map<Integer, LinkedList<PriorityQueue<NetChain>>> netChainPriorityQueueMap = new HashMap<Integer, LinkedList<PriorityQueue<NetChain>>>();
		int [] needOfConsume = null;
		while(index< graphContent.length){
			tempLine = graphContent[index++];
		if("".equals(tempLine)){
			blankLineCount ++;
			continue;
		}
		switch(blankLineCount){// Judge input content type
		
		/**This content contain number of net node, net chain and consume node**/
		case 0:
		    temp = tempLine.split(" ");
			netNodeCount = Integer.parseInt(temp[0]);
			chainCount = Integer.parseInt(temp[1]);
			consumeNodeCount = Integer.parseInt(temp[2]);
			if( netNodeCount > MAX_NET_NODE || consumeNodeCount > MAX_CONSUME_NODE)
				System.exit(0);
			netGraph = new NetGraph(netNodeCount, chainCount, consumeNodeCount);
			break;
			
		/**This content contain cost of server**/
		case 1:
			costOfServer = Integer.parseInt(tempLine);
			if( costOfServer < MIN_COST_SERVER || costOfServer > MAX_COST_SERVER)
				System.exit(0);
			break;
			
		/**This content contain source node and destination of chain, sum net capacity and cost of unit net**/
		case 2:
//			if(tempCount == chainCount){
//				continue;
//			}
			temp = tempLine.split(" ");
			sourceNode = Integer.parseInt(temp[0]);
			destNode = Integer.parseInt(temp[1]);
			sumCapacity = Integer.parseInt(temp[2]);
			costUnit = Integer.parseInt(temp[3]);
			if(sumCapacity < MIN_CAPACITY || sumCapacity > MAX_CAPACITY || costUnit < MIN_LINK_COST || costUnit > MAX_LINK_COST)
				System.exit(0);
			assert (netGraph != null);
//			if(netGraph == null)
//				System.exit(0);
			tempLink = netGraph.getNetVertex(sourceNode);
			/** Judge tempLink whether is null reference, if result is true then create a new chain that contain source node, destination node, 
			 * sum capacity and cost; else add a new chain in this tempLink**/
			if(tempLink == null){
				Chain chain = new NetChain(new NetNode(sourceNode), new NetNode(destNode), sumCapacity, costUnit);
				tempLink = new AdjLink(chain);
				netGraph.addNetVertex(sourceNode, tempLink);
			}else{
				tempLink.addChain(new NetChain(new NetNode(sourceNode), new NetNode(destNode), sumCapacity, costUnit));
			}
			tempLink = netGraph.getNetVertex(destNode);
			if(tempLink == null){
				Chain chain = new NetChain(new NetNode(destNode), new NetNode(sourceNode), sumCapacity, costUnit);
				tempLink = new AdjLink(chain);
				netGraph.addNetVertex(destNode, tempLink);
			}else{
				tempLink.addChain(new NetChain(new NetNode(destNode), new NetNode(sourceNode), sumCapacity, costUnit));
			}
			tempCount++;
			break;
			
		/**This content contain number of consume node, net node connect to this consume node and consume of web**/
		case 3:
			temp = tempLine.split(" ");
			consumeNode = Integer.parseInt(temp[0]);
			connectNode = Integer.parseInt(temp[1]);
			consumeNeed = Integer.parseInt(temp[2]);
			if(consumeNeed < MIN_CONSUME_NEED || consumeNeed > MAX_CONSUME_NEED)
				System.exit(0);
			tempLink = netGraph.getConsumeVertex(consumeNode);
			if(tempLink == null){
				Chain chain = new ConsumeChain(new ConsumeNode(consumeNode),new NetNode(connectNode), consumeNeed);
				tempLink = new AdjLink(chain);
				netGraph.addConsumeVertex(consumeNode, tempLink);
			}else{
				tempLink.addChain(new ConsumeChain(new ConsumeNode(consumeNode), new NetNode(connectNode), consumeNeed));
			}
			break;
		/****/	
		default :
			break;
			}
		}
		System.out.println("Building a net graph is success!");
		/** this code fragment apply for test net graph***/
		for(int i=0; i< consumeNodeCount ; i++){
			if(netGraph.getConsumeVertex(i) == null)
				continue;
			tempLink = netGraph.getConsumeVertex(i).getCurrent();
			if(tempLink != null)
				outPutLinkNode(tempLink);
		}
    	return  netGraph;
    }
    
    
	/**
	 * @param graph is a net graph, num is number of consume node.
	 * @return if exist a consume chain connect to this consume node then return this consume chain
	 *         else return null.
	 * **/
	private static ConsumeChain findConsumeChain(NetGraph graph, int num){
		AdjLink consumeNodeLink = graph.getConsumeVertex(num).getCurrent();
		if(consumeNodeLink != null){
			Chain chain = consumeNodeLink.getChain();
			if(chain instanceof ConsumeChain){
				return (ConsumeChain)chain;
			}
			else
				return null;
		}
		else
			return null;
	}
	
	private static PriorityQueue<NetChain> getAdjPriorityQueue(NetGraph graph, int num){
		PriorityQueue<NetChain> queue = new PriorityQueue<NetChain>(20);
		AdjLink netNodeLink = graph.getNetVertex(num).getCurrent();
		while(netNodeLink != null){
			queue.offer((NetChain)netNodeLink.getChain());
			netNodeLink = netNodeLink.getNext();
		}
		return queue;
	}
	/**@param  
	 * @return 
	 * **/
	private static int getCountOfNetChain(AdjLink link){
		return link.getSize();
	}
	
	private static void outPutLinkNode( AdjLink link){
		Chain chain;
		if(link == null){
			System.out.println("link is a null reference");
			return ;
		}
		while(link != null){
			chain = link.getChain();
			if(chain instanceof ConsumeChain){
				System.out.println("consume node" + ((ConsumeNode)((ConsumeChain)chain).getEither()).getNodeNumber() +",  connect node:"+ ((NetNode)((ConsumeChain)chain).getOther()).getNodeNumber() +",  consume need:"+ ((ConsumeChain)chain).getConsumeNeed());
			}else if(chain instanceof NetChain){
				System.out.println("net node"+ ((NetNode)((NetChain)chain).getEither()).getNodeNumber()+",  chain capacity:"+((NetChain)chain).getSumCapacoty()+",  cost:" +((NetChain)chain).getCost());
			}
			link = link.getNext();
		}
	}
	
	private void selectServer( NetGraph netGraph, int consumeNodeCount, int costOfServer){
		int sumCost=0,chainCost=0,pathCost=0, consumeNeed=0, avaliableNeed =0, size=0;
	    ArrayBlockingQueue<OutPath> currentServerNode = new ArrayBlockingQueue<OutPath>(consumeNodeCount);
		PriorityQueue< NetChain> queue = null;
		NetNode[] connectToConsumeNode = new NetNode[consumeNodeCount];
		int[] needOfConsume = new int[consumeNodeCount];
		OutPath path= null;
		for( int i=0; i< connectToConsumeNode.length; i++){
			ConsumeChain chain = findConsumeChain(netGraph, i);
			connectToConsumeNode[i] = (NetNode)(chain.getOther());
			connectToConsumeNode[i].setSelect(true);// whether select this node as server node, if is true then set true, else set false.
			connectToConsumeNode[i].setVisted(true);// if this node is be visted then set true, else set false.
			needOfConsume[i] = chain.getConsumeNeed();// get consume need of current consume node.
			chainCost=0;
			pathCost = costOfServer;// set path cost of current path.
			AdjLink link = new AdjLink(new OutChain(chain.getEither(), connectToConsumeNode[i]));// link of out path.
			OutPath outPath = new OutPath(link, needOfConsume[i], connectToConsumeNode[i], pathCost);// out path that connect to a consume node.
			connectToConsumeNode[i].addToOutPath();
			outPath.setFirstNode(connectToConsumeNode[i]);// set first node in the out path.
			currentServerNode.add(outPath);// add the out path to queue.
		}
		sumCost = consumeNodeCount* costOfServer;
		while(!currentServerNode.isEmpty()){
				path = currentServerNode.poll();// get a path object from queue.
				NetNode  netNode = path.getFirstNode();// get first node in the path object.
				//queue = getAdjPriorityQueue(netGraph, path.getServerNode().getNodeNumber());//get a priority queue of chain connect to current server
			//	updateServerNode(queue, path.getCapacity(), path.getSumCost());
			
		}
	}
	
	
	private void updateServerNode( NetChain chain, int consumeNeed, int oldCost){
			if(chain.getSumCapacoty()> consumeNeed){
				//((NetNode)chain.getOther(chain.getEither())).setSelect(true);
				
			}
		}
	
	
	private ArrayList<NetChain> minCostMaxFlow( AdjLink link, int capacity){
		int cost=0, sumCapacity=0;
		PriorityQueue<NetChain> queue = new PriorityQueue<NetChain>();// store all net chain connect to current net node.
		ArrayList<NetChain> arrayList = new ArrayList<NetChain>();// store all chain that enough to meet need of capacity.
		AdjLink currentLink = link.getCurrent();
		NetChain tempChain = null;
		NetNode node = null;
		while(currentLink != null){
			queue.offer((NetChain)currentLink.getChain());
			currentLink = currentLink.getNext();
		}
		while(!queue.isEmpty()){
			tempChain = queue.poll();
			node = (NetNode)tempChain.getOther();
			if(node.getVisted()){
				if(node.getIsInOutPath()){ // if current net node has been add into a out path,then set it as a new server node, else skip current net node.
					node.setSelect(true); // set current net node as a new server node
				}
				else
					continue;// if destination node of current chain is visted, then skip current chain.
			}
			arrayList.add(tempChain);
			sumCapacity += tempChain.getSumCapacoty();
			if(sumCapacity>= capacity)
				break;
			
		}
		if(sumCapacity < capacity) 
			return null;
		return arrayList;
	}
}

