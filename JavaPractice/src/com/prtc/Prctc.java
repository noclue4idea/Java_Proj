package com.prtc;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;

public class Prctc {

	/**
	 * @param args
	 */
	/**
	 * 
	 */
	public void demoCollections()
	{
		List<Integer> numList= new ArrayList<Integer>();
		numList.add(11);
		numList.add(12);
		numList.add(13);
		numList.add(14);
		numList.add(15);
		
		System.out.println("Before iter: "+numList.size());
		ListIterator<Integer> itr= numList.listIterator();
		
		while(itr.hasNext())
		{
			System.out.println("Itr : "+itr.next());
			
			itr.set(51);
		}
		System.out.println("After iter: "+numList.size());
		List<String> nameList= new LinkedList<String>();
		
		nameList.add("hfg");
		nameList.add("itmfv");
		
	/*	for(String s: nameList)
		{
			System.out.println("Printing linkedList: "+s);
		}*/
		
		for(Integer a: numList)
		{
			System.out.println("Printing ArrayList: "+a);
		}
		
		Map<Integer,String> nbv= new HashMap<Integer,String>();
		nbv.put(1, "Sam");
		nbv.put(2, "Ram");
		
		for(Map.Entry hm:nbv.entrySet()){
			System.out.println("key: "+hm.getKey());
			System.out.println("value: "+hm.getValue());
		}
		
		Set<Integer> keys= nbv.keySet();
		
		for(int i:keys){
			
			System.out.println("Printing map: "+nbv.get(i));
		}
	}
	
	public void swapString(String s)
	{
		char[] arr= s.toCharArray();
		int len= arr.length;
		char C= arr[0];
		//char endC= arr[len-1];
		arr[0]=arr[len-1];
		arr[len-1]=C;
		
		String str= new String(arr);
		System.out.println("Swap::"+str);
		
	}
	
	
	public static void main(String[] args) throws CustomException {
		// TODO Auto-generated method stub
		
		
		String a= "geeks for geeks";
		
		
		Prctc prt= new Prctc();
		prt.swapString(a);
		//prt.demoCollections();
		
	/*	OverDemo2 dm= new OverDemo1();
		
		ThreadDemo thd= new ThreadDemo(1);
	
		
		ThreadDemo vfx= new ThreadDemo(3);
		
		
		ThreadDemo mnb= new ThreadDemo(5);
		
		vfx.start();
		try {
			vfx.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		thd.start();
		try {
			System.out.println("Is the thread alive::"+thd.isAlive());
			thd.join();
			System.out.println("Is the thread alive::"+thd.isAlive());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		mnb.start();
		//dm.sum(3, 6);
		//dm.throwExp(6);
		 * */
		 
		
	}

}
