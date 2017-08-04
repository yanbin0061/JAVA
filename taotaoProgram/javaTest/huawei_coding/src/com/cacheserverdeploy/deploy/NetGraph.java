package com.cacheserverdeploy.deploy;
public class NetGraph {
	private int netVertexNum;
	private int edgeNum;
	private int consumeVertexNum;
	private AdjLink[] adjOfNetNode, adjOfConsume;
	public NetGraph(int netVertexNum, int edgeNum, int consumeVertexNum){
		this.netVertexNum = netVertexNum;
		this.edgeNum = edgeNum;
		this.consumeVertexNum = consumeVertexNum;
		adjOfNetNode = new AdjLink[netVertexNum];
		adjOfConsume = new AdjLink[consumeVertexNum];
	}
	
	/**
	 * @param num : number of net node
	 * @return   a source node number of num in this link.
	 * **/
	public AdjLink getNetVertex( int num){
		return adjOfNetNode[num];
	}
	
	/**
	 * @param num : number of consume node
	 * @return   a source node number of num in this link.
	 * **/
	public AdjLink getConsumeVertex( int num){
		return adjOfConsume[num];
	}
	
	/****/
	public void addNetVertex( int num, AdjLink link){
		adjOfNetNode[num] = link;
	}
	
	/****/
	public void addConsumeVertex( int num, AdjLink link){
		adjOfConsume[num] = link;
	}
}
