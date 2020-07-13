package com.java.prctc.stack;

import java.util.Stack;

public class StackProblems {
	
	static Stack<Integer> s1= new Stack<Integer>();
	static Stack<Integer> s2= new Stack<Integer>();
	
	// Implementing queue using stack
	public void enQueue(int x)
	{
		while(!s1.isEmpty())
		{
			s2.push(s1.pop());
		}
		s1.push(x);
		
		while(!s2.isEmpty())
		{
			s1.push(s2.pop());
		}
	}
	
	public void deQueue()
	{
		if(s1.isEmpty())
		{
			System.out.println("Queue is empty!!!");
			return;
		}
		int z=s1.peek();
		s1.pop();
		System.out.println(z);
	}

}
