package com.cacheserverdeploy.deploy;

public class NetNode implements Node{
	private int number;
	private boolean isSelect = false;
	private boolean isVisted = false;
	private boolean isInOutPath = false;
	public NetNode(int number) {
		// TODO Auto-generated constructor stub
		this.number = number;
	}
	
	public int getNodeNumber(){
		return this.number;
	}
	
	public void setSelect( boolean select){
		this.isSelect = select;
	}
	
	public boolean getSelectStatus(){
		return this.isSelect;
	}
	
	public void setVisted(boolean vist){
		this.isVisted = vist;
	}
	
	public boolean getVisted(){
		return this.isVisted;
	}
	
	public void addToOutPath(){
		this.isInOutPath = true;
	}
	
	public boolean getIsInOutPath(){
		return this.isInOutPath;
	}
}
