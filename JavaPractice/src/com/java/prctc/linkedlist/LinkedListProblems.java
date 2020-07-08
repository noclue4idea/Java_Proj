package com.java.prctc.linkedlist;

public class LinkedListProblems {

	public void printListEle()
	{
		System.out.println("Getting into fun");
		System.out.println("Head:"+LinkedListC.head);
		while(LinkedListC.head!=null)
		{
			System.out.println("data:"+LinkedListC.head.data);
			LinkedListC.head=LinkedListC.head.next;
		}
	}
	// Search element in linkedlist
	public void findElement(int ele)
	{
		//LinkedListC list= new LinkedListC();
		Node temp=LinkedListC.head;
		boolean found=false;
		System.out.println("head of list: "+LinkedListC.head.data);
		if(temp==null)
		{
			System.out.println("Empty list");
			System.exit(0);
		}
		while(temp!=null)
		{
			if(temp.data==ele)
			{
				found=true;
				break;
			}
			temp=temp.next;
		}
		if(found)
		{
			System.out.println("Element found");
		}
		else{
			System.out.println("Element not found");
		}
	}
	
	// Nth node from end
	public void NodeFromLast(int pos)
	{
		Node slow_ptr=LinkedListC.head;
		Node fast_ptr=LinkedListC.head;
		int count=0;
		if(LinkedListC.head!=null)
		{
			while(count<pos)
			{
				fast_ptr=fast_ptr.next;
				count++;
			}
			while(fast_ptr!=null)
			{
				fast_ptr=fast_ptr.next;
				slow_ptr=slow_ptr.next;
			}
			System.out.println(pos+"th node from last: "+slow_ptr.data);
		}
	}
	
	// Middle element of LinkedList
	public void middleElement()
	{
		Node slow_ptr=LinkedListC.head;
		Node fast_ptr=LinkedListC.head;
		
		if(LinkedListC.head!=null)
		{
			while(fast_ptr!=null && fast_ptr.next!=null)
			{
				fast_ptr=fast_ptr.next.next;
				slow_ptr=slow_ptr.next;
						
			}
			System.out.println("middle element: "+slow_ptr.data);
		}
	}
	
	//Detecting loop in a linkedlist
	public void detectLoop()
	{
		Node slow_ptr=LinkedListC.head;
		Node fast_ptr=LinkedListC.head;
		boolean loop=false;
		if(LinkedListC.head!=null)
		{
			while(fast_ptr!=null && fast_ptr.next!=null)
			{
				fast_ptr=fast_ptr.next.next;
				slow_ptr=slow_ptr.next;
				if(slow_ptr==fast_ptr)
				{
					loop=true;
					break;
					
				}	
			}
		}
		if(loop)
		{System.out.println("Loop found ");}
		else{System.out.println("Loop not found");}
	}
	
	// Creating loop in a list at a particular position
	public void createloop(int pos)
	{
		int count=0;
		Node temp=LinkedListC.head;
		Node first=LinkedListC.head;
		Node last=LinkedListC.head;
		if(LinkedListC.head!=null)
		{
			while(temp!=null)
			{
				last=temp;
				count++;
				if(count==pos)
				{
					first=temp;
				}
				temp=temp.next;
			}
			System.out.println("First & Last: "+first.data+", "+last.data);
			
			last.next=first;
		}
	}
	
	// counting loop's length
	public void loopLength()
	{
		
		Node fast=LinkedListC.head;
		Node slow=LinkedListC.head;
		Node loop=null;
		int count=1;
		if(LinkedListC.head!=null)
		{
			while(fast!=null && fast.next!=null)
			{
				fast=fast.next.next;
				slow=slow.next;
				if(fast==slow)
				{
					loop=slow;
					break;
				}
			}
			if(loop!=null)
			{
				while(loop.next!=slow)
				{
					count++;
					loop=loop.next;
				}
				System.out.println("length of loop "+count);
			}
		}
	}
	
	//** Removing duplicates from sorted LinkedList
	public void removeDups()
	{
		Node prev=LinkedListC.head;
		Node temp=LinkedListC.head.next;
		
		if(LinkedListC.head!=null)
		{
		while(temp!=null)
		{
			int pd=prev.data;
			int nd=temp.data;
			if(pd==nd)
			{
				prev.next=temp.next;
				temp=temp.next;
			}
			else
			{
				prev=prev.next;
				temp=temp.next;
			}
		}
		while(LinkedListC.head!=null)
		{
			System.out.println("Data::"+LinkedListC.head.data);
			LinkedListC.head=LinkedListC.head.next;
		}
		}
	}
	
	//** Swapping nodes of LinkedList
	/*
	public void swapNodes(int x,int y)
	{
		Node temp=LinkedListC.head;
		Node preX=LinkedListC.head;
		Node preY=LinkedListC.head;
		Node X1=LinkedListC.head;
		Node Y1=LinkedListC.head;
		Node posX=LinkedListC.head;
		Node posY=LinkedListC.head;
		System.out.println("jhbitg");
		if(LinkedListC.head!=null)
		{System.out.println("condfhg");
			while(temp!=null)
			{
				int dd=temp.next.data;
				if(dd==x)
				{System.out.println("1st one");
					preX=temp;
					X1=temp.next;
					posX=X1.next;
				}
				if(dd==y)
				{System.out.println("2nd one");
					preY=temp;
					Y1=temp.next;
					posY=Y1.next;
				}
				temp=temp.next;
			}
			preX.next=Y1;
			Y1.next=posX;
			System.out.println("Data::"+preX.next.data);
			preY.next=X1;
			X1.next=posY;
			while(LinkedListC.head!=null)
			{
				System.out.println("Data::"+LinkedListC.head.data);
				LinkedListC.head=LinkedListC.head.next;
			}
		}
		
	}*/
	public void swapElements()
	{
		Node preHead= LinkedListC.head;
		Node temp=LinkedListC.head;
		Node a=null;
		while(temp.next!=null)
		{
			a=temp;
			temp=temp.next;
		}
		
		LinkedListC.head=a.next;
		a.next=null;
		LinkedListC.head.next=preHead;
		while(LinkedListC.head!=null)
		{
			System.out.println("data:"+LinkedListC.head.data);
			LinkedListC.head=LinkedListC.head.next;
		}
	}
	
	//*** Reversing a Linked List
	public void reverseList(Node curr,Node prev)
	{
		if(curr.next==null)
		{
			LinkedListC.head=curr;
			curr.next=prev;
			return;
		}
		Node next1=curr.next;
		curr.next=prev;
		
		reverseList(next1,curr);
	}
	
	public void isCircular()
	{
		Node temp= LinkedListC.head;
		if(LinkedListC.head!=null)
		{
			{
				if(temp.next==LinkedListC.head)
				{
					System.out.println("Circular linked list");
					return;
				}
			}
		}
		else if(LinkedListC.head==null)
		{
			System.out.println("Circular linked list because it is empty");
			return;
		}
		System.out.println("Not Circular linked list");
	}
}
