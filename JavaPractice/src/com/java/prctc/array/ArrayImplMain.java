package com.java.prctc.array;

import java.util.ArrayList;

public class ArrayImplMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayProblems ap=new ArrayProblems();
		int[] arr={1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9};
		//ap.reverseArray(arr);
		//ap.moveZerosToEnd(arr);
		//ap.rearrangeArray(arr);
		//ap.getMinDistance(arr, -1, 2);
		//ap.findMinDistance(arr);
		//ap.findMinProduct( arr,4);
		ArrayList<Query> q = new ArrayList<Query>(); 
        q.add(new Query(0,4)); 
        q.add(new Query(1,3)); 
        q.add(new Query(2,4)); 
  
        int a[] = {10,20,35,50,75,80}; 
        int N[] = {5, 7, 9, 25}; 
        int X=70;
		//ap.queryResults(a, a.length, q, q.size());
        //ap.preProcess(a);
        //ap.callDecompose(q);
        //ap.kSort(a, 3);
        //ap.mergeSortedArray(a, N);
        //ap.findUniqEle(a);
        ap.existsPair(a, X);
	}

}
