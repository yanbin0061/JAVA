package com.cacheserverdeploy.deploy;
public class OutPath {
	private AdjLink link;
	private NetNode serverNode;
	private NetNode firstNode;
	private int webCapacity;
	private int sumCost;
	public OutPath( AdjLink link, int capacity, NetNode node, int cost) {
		// TODO Auto-generated constructor stub
		this.link = link;
		this.webCapacity = capacity;
		this.serverNode = node;
		this.sumCost = cost;
		this.firstNode= null;
	}

	public AdjLink getPath(){
		return this.link;
	}
	
	public int getCapacity(){
		return this.webCapacity;
	}
	
	public NetNode getServerNode(){
		return this.serverNode;
	}
	
	public int getSumCost(){
		return this.sumCost;
	}
	
	public void setFirstNode( NetNode firstNode){
		this.firstNode = firstNode;
	}
	
	public NetNode getFirstNode(){
		return this.firstNode;
	}
}
