package com.interview.prep.programmingpuzzles;

public class Node {
	
	
	private Node nextNode;
	private Object data;
	
	Node(Object dataToStore){
		
		this.data = dataToStore;
	}
	public Node getNextNode() {
		return nextNode;
	}
	public void setNextNode(Node nextNode) {
		this.nextNode = nextNode;
	}
	public Object getData() {
		return data;
	}
	public void setData(Object data) {
		this.data = data;
	}


}
