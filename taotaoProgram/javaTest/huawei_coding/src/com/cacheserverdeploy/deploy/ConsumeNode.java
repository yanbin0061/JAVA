package com.cacheserverdeploy.deploy;

public class ConsumeNode implements Node{
	private int number;
	public ConsumeNode( int number) {
		// TODO Auto-generated constructor stub
		this.number = number;
	}

	public int getNodeNumber(){
		return this.number;
	}
}
