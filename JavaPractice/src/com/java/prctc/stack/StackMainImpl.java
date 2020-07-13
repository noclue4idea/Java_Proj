package com.java.prctc.stack;

public class StackMainImpl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	/*	StackProblems q = new StackProblems();  
	    q.enQueue(1);  
	    q.enQueue(2);  
	    q.enQueue(3);  
	    
	    q.deQueue();
	    q.deQueue();
	    q.deQueue();*/
	    
	    TwoStacks ts = new TwoStacks(5); 
        ts.push1(5); 
        ts.push2(10); 
        ts.push2(15); 
        ts.push1(11); 
        ts.push2(7); 
        
        ts.pop1();
        ts.push2(40); 
        ts.pop2();
	}

}
