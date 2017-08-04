package com.cacheserverdeploy.deploy;

public class NetChain implements Chain {
	private int sumCapacoty;
	private int cost;
	private Node source, dest;
	public NetChain( Node source, Node dest, int capacity, int cost) {
		// TODO Auto-generated constructor stub
		this.sumCapacoty = capacity;
		this.cost = cost;
		this.source = source;
		this.dest = dest;
	}
	
	/**
	 * @return  sum capacity of net chain
	 * **/
	public int getSumCapacoty() {
		return sumCapacoty;
	}
	
	/**
	 * @return  rent cost of one Gbps network flow in this net chain
	 * **/
	public int getCost() {
		return cost;
	}

	/**
	 * @param void
	 * @return source node of this consume chain
	 * **/
	public Node getEither(){
		 return this.source;
	}
	
	/**
	 * @param one node of this consume chain
	 * @return other node of this consume chain
	 * **/
	public Node getOther(){
			return this.dest;
	}
	
	/**
	 * @return 1 cost value of parameter chain  greater than them chain
	 * 		   0 cost value of them chain equal to parameter chain
	 * 		  -1 cost value of parameter chain  small than them chain
	 * 		  -2  parameter chain is no belong to instance of net chain class 
	 * @param 
	 * ***/
	public int compareTo( Chain chain){
		if(chain instanceof NetChain){
			if(this.cost > ((NetChain)chain).getCost())
				return 1;
			else if(this.cost == ((NetChain)chain).getCost())
				return 0;
			else return -1;
		
		}
		else
			return -1;
	}
}
