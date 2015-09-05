package com.interview.prep.programmingpuzzles;

public class ReverseALinkedList {

	Node head;
	Node tail;
	
	void addElelementsInList(Object data){
		
		if(head == null){
			head = new Node("This is node 1");
			head.setNextNode(head);
			
			tail = head;
		}else{
			Node node = new Node(data);
			tail.setNextNode(node);
			node = tail;
		}
	}
	
	void traverseInLList(){
		
		Node temp;
		temp = head;
		
		while(temp != null){
			
			System.out.println("Node  : "+temp.getData()+"   "+temp.getNextNode());
			temp = temp.getNextNode();
		}
	}
	
	void reverseLinkedList(){
		
	}
	
	public static void main(String[] args) {
		
		ReverseALinkedList linkedlist = new ReverseALinkedList();
		linkedlist.addElelementsInList("hello");
		linkedlist.addElelementsInList("one");
		linkedlist.addElelementsInList("two");
		linkedlist.addElelementsInList("three");
		
		linkedlist.traverseInLList();
	}
	
}
