package com.java.prctc.stack;

public class TwoStacks {

	int size;
	int top1,top2;
	int arr[];
	
	TwoStacks(int s)
	{
		size=s;
		top1=-1;
		top2=size;
		arr=new int[s];
	}
	
	public void push1(int x)
	{
		if(top1<top2-1)
		{
			top1++;
			arr[top1]=x;
		}
		else
		{
			System.out.println("Stack overflow");
			System.exit(1);
		}
	}
	
	public void push2(int x)
	{
		if(top1<top2-1)
		{
			top2--;
			arr[top2]=x;
		}
		else
		{
			System.out.println("Stack overflow");
			System.exit(1);
		}
	}
	
	public void pop1()
	{
		 if(top1>=0)
		 {
			 int x= arr[top1];
			 top1--;
			 System.out.println("From 1st stack: "+x);
		 }
		 else
			{
				System.out.println("Stack underflow");
				System.exit(1);
			}
	}
	
	public void pop2()
	{
		if(top2<size)
		{
			int x=arr[top2];
			top2++;
			System.out.println("From 2nd stack: "+x);
		}
		else
		{
			System.out.println("Stack underflow");
			System.exit(1);
		}
	}
}
