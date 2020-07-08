package com.java.prctc.array;

import java.util.*;
import java.util.ArrayList;
import java.util.Arrays;

public class ArrayProblems {

	int MAX_SIZE=10000;
	int SQRT=100;
	int[] queryArray= new int[MAX_SIZE];
	int[] blockArray= new int[SQRT];
	int blockSize;
	
	public  void printArray(int[] arr)
	{
		for(int j:arr)
		{
			System.out.print(j+" ");
		}
	}

	public void reverseArray(int[] arr)
	{
		int n;
		int l=arr.length;
		n=l-1;
		for(int i=0;i<arr.length && n>i;i++)
		{
			int ele=arr[i];
			arr[i]=arr[n];
			arr[n]=ele;
			n=n-1;

		}
		for(int j:arr)
		{
			System.out.println(j);
		}
	}

	public void moveZerosToEnd(int[] arr)
	{

		int endP;
		int l= arr.length;
		endP=l-1;

		for(int j=0;j<arr.length && endP>j;j++)
		{
			if(arr[j]==0)
			{
				for(int k=endP;k>=0;k--)
				{
					if(arr[k]!=0)
					{
						int g=arr[k];
						arr[k]=arr[j];
						arr[j]=g;
						endP=k-1;
						break;
					}
				}
			}
		}

		for(int m:arr)
		{
			System.out.println(m);
		}
	}

	//Rearranging positive and negative numbers alternatively by using partition method

	public void rearrangeArray(int[] arr)
	{
		int l=arr.length;
		int i=-1;
		for(int j=0;j<l;j++)
		{
			if(arr[j]<0)
			{
				i++;
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				//System.out.println("arr[i]="+arr[i]+" "+"arr[j]="+arr[j]);
			}
		}
		int pos=i+1;
		int neg=0;
		while(pos<l && pos>neg && arr[neg]<0){
			int temp=arr[neg];
			arr[neg]=arr[pos];
			arr[pos]=temp;
			pos+=1;
			neg+=2;
		}
		printArray(arr);
	}

	// minimum distance between two numbers
	public void getMinDistance(int[] arr, int x,int y)
	{
		int posx=-1;
		int posy=-1;
		int l=arr.length;
		int d=Integer.MAX_VALUE;

		for(int i=0;i<l;i++)
		{
			if(arr[i]==x)
			{
				posx=i;
			}
			if(arr[i]==y)
			{
				posy=i;
			}
			if(posx>-1 && posy>-1)
			{
				int sub=Math.abs(posx-posy);
				if(sub<d)
				{
					d=sub;
				}
			}
		}
		System.out.println("Min distance:"+d);
	}
	//Finding min jump required to reach end
	public void findMinDistance(int[] arr)
	{
		int i=0;
		int l=arr.length;
		int count=1;
		if(arr[0]==0)
		{System.out.println("Not possible!!!!");
		System.exit(0);}
		while(i<l)
		{
			int ele= arr[i];
			int[] subArr=Arrays.copyOfRange(arr, i+1, ele+i+1);
			Arrays.sort(subArr);
			System.out.println("SubArr:"+subArr[ele-1]);
			count+=1;
			i=i+subArr[ele-1];
		}
		System.out.println("Min jump:"+count);
	}

	// Minimum product of k integers in a positive array
	public void findMinProduct(int[] arr,int k)
	{
		int l=arr.length;
		Arrays.sort(arr);
		int mul=1;
		for(int i=0;i<k;i++)
		{
			mul=mul*arr[i];
		}
		System.out.println("Minimum product:"+mul);
	}

	
	//********* MO's Algorithm Started ************************************
	
	public void queryResults(int a[], int n, ArrayList<Query> q, int m){ 
        
        
        final int block = (int) Math.sqrt(n);  
      
      
        Collections.sort(q, new Comparator<Query>(){ 
              
            
            public int compare(Query x, Query y){ 
  
                // Different blocks, sort by block.  
            	System.out.println("x.L "+x.L+" ,y.L "+y.L);
            	System.out.println("x.R "+x.R+" ,y.R "+y.R);
                if (x.L/block != y.L/block)  
                    return (x.L < y.L ? -1 : 1);  
  
                return (x.R < y.R ? -1 : 1); 
            } 
        }); 
  
        for(Query p:q)
        {
        	System.out.println("Query:"+p.L+","+p.R);
        }
      
        int currL = 0, currR = 0;  
        int currSum = 0;  
      
        // Traverse through all queries  
        for (int i=0; i<m; i++)  
        {  
            // L and R values of current range 
            int L = q.get(i).L, R = q.get(i).R;  
  
           
            while (currL < L)  
            {  
                currSum -= a[currL];  
                currL++;  
                System.out.println("currSum l1 "+currSum);
            }  
  
            // Add Elements of current Range  
            while (currL > L)  
            {  
                currSum += a[currL-1];  
                currL--;  
                System.out.println("currSum l2 "+currSum);
            }  
            while (currR <= R)  
            {  
                currSum += a[currR];  
                currR++;  
                System.out.println("currSum r1 "+currSum);
            }  
  
         
            while (currR > R+1)  
            {  
                currSum -= a[currR-1];  
                currR--;  
                System.out.println("currSum r2 "+currSum);
            }  
  
            System.out.println("Sum of [" + L + 
                           ", " + R + "] is "  + currSum);  
        }  
	}
	//*********************** MO's Algorithm ended here ******************************************** 
	
	//****** Impl of Square Root Decomposition Technique **********************
	
	public void preProcess(int[] arr)
	{
		int l=arr.length;
		blockSize=(int) Math.sqrt(l);
		int blockIndex=-1;
		
		for(int i=0;i<l;i++)
		{
			queryArray[i]=arr[i];
			if(i%blockSize==0)
			{
				blockIndex+=1;
			}
			blockArray[blockIndex]+=queryArray[i]; 
		}
		//printArray(blockArray);
	}
	
	public int getDecomposeResults(int l,int r)
	{
		int sum=0;
		
		while(l+blockSize<=r)
		{
			sum+=blockArray[l/blockSize];
			l+=blockSize;
		}
		
		while(l<r && l%blockSize!=0 && l!=0)
		{
			sum+=queryArray[l];
			l++;
		}
		
		while(l<=r)
		{
			sum+=queryArray[l];
			l++;
		}
		//System.out.println("Result of ["+l+","+r+"]= "+sum);
		return sum;
	}
	
	public void callDecompose(ArrayList<Query> q2)
	{
		for(Query q:q2)
		{
			int sum=getDecomposeResults(q.L,q.R);
			System.out.println("Result of ["+q.L+","+q.R+"]= "+sum);
		}
	}
	
	//**************** Square Root Decomposition Technique ended here ********************
	
	public void kSort(int[] arr, int k)
	{
		int n=arr.length;
		PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(); 

		// add first k + 1 items to the min heap 
		for(int i = 0; i < k + 1; i++) 
		{ 
			priorityQueue.add(arr[i]); 
			
		} 

		int index = 0; 
		for(int i = k + 1; i < n; i++) 
		{ 
			arr[index++] = priorityQueue.peek(); 
			System.out.println("priorityQueue.peek(): "+arr[index++]);
			priorityQueue.poll(); 
			priorityQueue.add(arr[i]); 
		} 

		Iterator<Integer> itr = priorityQueue.iterator(); 

		while(itr.hasNext()) 
		{ System.out.println("index:"+index);
			arr[index++] = priorityQueue.peek(); 
			priorityQueue.poll(); 
		} 
		printArray(arr);
	}
	
	//******* Merging two sorted array*************
	public void mergeSortedArray(int[] mPn, int[] n)
	{
		int p=mPn.length;
		int q=n.length;
		int nullP=0;
		boolean nullFlag=false;
		int lp=0;
		
		for(int i=0;i<q;i++)
		{
			int a= n[i];
			for(int j=0;j<p;j++)
			{
				if(mPn[j]==-1)
				{	if(!nullFlag)
					{
					nullP=j;
					nullFlag=true;
					lp=j-1;
					}
					if(nullP==(p-1))
					{
						mPn[j]=n[i];
					}
				}
				else if(mPn[j]!=-1)
				{
					if(nullFlag)
					{
						if(n[i]<mPn[j])
						{
							if(n[i]>mPn[lp])
							{
							mPn[nullP]=n[i];
							nullFlag=false;
							break;
							}
							else{
								mPn[nullP]=mPn[lp];
								mPn[lp]=n[i];
								nullFlag=false;
								break;
							}
						}
						else
						{
							mPn[nullP]=mPn[j];
							mPn[j]=n[i];
							nullFlag=false;
							break;
						}
					}
					
				}
			}
			
		}
		printArray(mPn);
	}
	
	//***** Ended here ***********
	
	public void findUniqEle(int[] arr)
	{
		int l= arr.length;
		int res= arr[0];
		for(int i=1;i<l;i++)
		{
			res=res^arr[i];
			System.out.println("Printing XOR: "+res);
		}
		System.out.println("Element with one occurance: "+res);
	}
	//***** Two pointers technique (uses the fact that array is sorted)
	public void existsPair(int[] arr,int X)
	{
		int i=0;
		int j= arr.length-1;
		boolean flag=false;
		while(i<j)
		{
			if(arr[i]+arr[j]==X)
			{
				System.out.println("Found pair: "+arr[i]+","+arr[j]);
				flag=true;
				break;
			}
			if(arr[i]+arr[j]<X)
			{
				i++;
			}
			else
			{
				j--;
			}
		}
		if(!flag)
		{
			System.out.println("Pair does not exist");
		}
	}
	
	//*Ended here***
}
