package com.cacheserverdeploy.deploy;

public class ConsumeChain implements Chain {
	private int consumeNeed;
	private Node source, dest;
	public ConsumeChain( Node source, Node dest, int consume) {
		// TODO Auto-generated constructor stub
		this.source = source;
		this.dest = dest;
		this.consumeNeed = consume;
	}
	
	/**
	 * @param void
	 * @return need of net of consume node
	 * **/
	public int getConsumeNeed() {
		return consumeNeed;
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
	 * @return 1 consume need value of parameter chain  greater than them chain
	 * 		   0 consume need value of them chain equal to parameter chain
	 * 		  -1 consume need value of parameter chain  small than them chain
	 * 		  -2  parameter chain is no belong to instance of consume chain class 
	 * @param 
	 * ***/
	public int compareTo( Chain chain){
		if(chain instanceof ConsumeChain){
			if(this.consumeNeed > ((ConsumeChain)chain).getConsumeNeed())
				return 1;
			else if(this.consumeNeed == ((ConsumeChain)chain).getConsumeNeed())
				return 0;
			else return -1;
		
		}
		else
			return -2;
	}
	
}
