package com.java.prctc.linkedlist;

public class LinkedListMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedListC llist = new LinkedListC(); 
        llist.push(3); 
        llist.push(6); 
        llist.push(8); 
        llist.push(12); 
        llist.push(16); 
        llist.push(18); 
        llist.push(21); 
      
        //llist.printList();
        LinkedListProblems lp= new LinkedListProblems();
        //lp.findElement(4);
        //lp.NodeFromLast(4);
        //lp.middleElement();
        //lp.createloop(1);  //making it circular
        //lp.detectLoop();
        //lp.loopLength();
        //lp.removeDups();
        //lp.swapNodes(18, 6);
        //lp.swapElements();
        //lp.reverseList(llist.head, null);
        //lp.printListEle();
        lp.isCircular();
	}

}
