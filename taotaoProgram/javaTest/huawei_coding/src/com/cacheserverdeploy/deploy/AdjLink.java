package com.cacheserverdeploy.deploy;

public class AdjLink {
	private AdjLink current, next;
	private Chain chain;
	private int size=0;
	public AdjLink(Chain chain){
		this.chain = chain;
		this.size =1;
		this.current = this;
		this.next = null;
	}
	
	public void addChain( Chain chain){
		AdjLink temp = new AdjLink(chain);
		temp.setNext(current);
		current = temp;
		size++;
	}

	public AdjLink getNext() {
		return next;
	}

	public Chain getChain() {
		return chain;
	}

	public void setNext(AdjLink next) {
		this.next = next;
	}

	public void setChain(Chain chain) {
		this.chain = chain;
	}

	public AdjLink getCurrent() {
		return current;
	}
	
	public int getSize(){
		return this.size;
	}
}
