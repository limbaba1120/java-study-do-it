package org.java.masteringjava.ch02.LinkedList;

public class MyListNode {

	private String data;

	MyListNode next;


	public MyListNode() {
		data = null;
		next = null;
	}

	public MyListNode(String data) {
		this.data = data;
		this.next = null;;
	}

	public MyListNode(String data, MyListNode next) {
		this.data = data;
		this.next = next;
	}

	public String getData(){
		return data;
	}

}
