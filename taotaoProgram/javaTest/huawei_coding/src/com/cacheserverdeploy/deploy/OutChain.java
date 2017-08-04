package com.cacheserverdeploy.deploy;
public class OutChain implements Chain {
	private Node source, dest;
	public OutChain(Node source, Node dest) {
		// TODO Auto-generated constructor stub
		this.source = source;
		this.dest = dest;
	}

	public int compareTo(Chain chain){
		return -1;
	}
	
	public Node getSource(){
		return this.source;
	}
	
	public Node getDest(){
		return this.dest;
	}
}
