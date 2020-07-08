package com.java.prctc.linkedlist;

public class LinkedListC{

	public static Node head;
	public void push(int new_data) 
    { 
        Node new_node = new Node(new_data); 
  
        new_node.next = head; 
  
        head = new_node; 
    } 
	
	public void printList()
	{
		while(head!=null)
		{
			System.out.println("Data::"+head.data);
			head=head.next;
		}
	}
}
