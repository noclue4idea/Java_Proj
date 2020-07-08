package com.java.prctc;

import java.util.ArrayList;
import java.util.List;

public class DuplRearrange {
	
	public String newString(String s)
	{
		char[] str= s.toCharArray();
		
		for(int i=0;i<str.length;i++)
		{
			if(i<(str.length-1) && str[i]==str[i+1])
			{
				for(int j=i+1;j<str.length;j++)
				{
					if(str[j]!=str[i])
					{
						char temp= str[j];
						str[j]=str[i+1];
						str[i+1]=temp;
						break;
					}
					
				}
			}
		}
		
		return (new String(str));
		
	}
	
	// SumString Check  throws NumberFormatException
	
	public int checkSumString(String s) 
	{
		
		int m,n,o=0;
		int x=1;
		int y=2;
		int z=3;
		
		int len= s.length();
		
		while(o>=0)
		{
			m=len-x;
			n=len-y;
			o=len-z;
			
			Integer sumF= Integer.valueOf(s.substring(m,len));
			Integer sum1= Integer.valueOf(s.substring(n,m)); 
			Integer sum2= Integer.valueOf(s.substring(o,n)); 
			
			if(sumF==(sum1+sum2))
			{
				System.out.println("It is a sum String::"+sumF+"= "+sum1+"+"+sum2);
				return 1;
			}
			else
			{
				x=x+1;
				y=y+2;
				z=z+3;
			}
		}
		return 0;
	}
	
	
// Function to count number of substrings
	
	public void getCount(String s)
	{
		int subC=1;
		int count=0;
		
		int l= s.length();
		
		while(subC<=l)
		{
			int b=0;
			int e=subC;
			
			for(int i=e;i<=l;i++)
			{
				String g=s.substring(b,i);
				System.out.println(g);
				b=b+1;
				count+=1;
			}
			subC+=1;
		}
		System.out.println("Total no of substrings::"+count);
	
	}
	
// Function to count number of words
	public void getWordCount(String s)
	{
		final int OUT=0;
		final int IN=1;
		int state=OUT;
		int i=0;
		int wc=0;
		
		while(i<s.length())
		{
			if(s.charAt(i)==' ' || s.charAt(i)=='\n'|| s.charAt(i)=='\t')
			{
				state=OUT;
			}
			else if(state==OUT){
				wc++;
				state=IN;
			}
			i++;
		}
		System.out.println("No of words::"+wc);
		
	}

// Function to get smallest and largest word in a String
	public void getSmallAndLargest(String s)
	{
		final int OUT=0;
		final int IN=1;
		int state=OUT;
		int i=0;
		int wc=0;
		String smallest="";
		String largest="";
		String temp="";
		
		while(i<s.length())
		{
			if(s.charAt(i)==' ' || s.charAt(i)=='\n'|| s.charAt(i)=='\t')
			{
				state=OUT;
				if(smallest.equals("")&& largest.equals(""))
				{
					smallest=temp;
					largest=temp;
				}
				else if(temp.length()<smallest.length())
				{
					smallest=temp;
				}
				else if(temp.length()>largest.length())
				{
					largest=temp;
				}
			}
			else if(state==OUT){
			
				temp="";
				state=IN;
			}
		   if(state==IN)
			{
				temp+=s.charAt(i);
			}
			i++;
		}
		System.out.println("Smallest word::"+smallest);
		System.out.println("Largest word::"+largest);
		
	}
	
// Function to print all distinct characters in String
	
	public void distinctChars(String s)
	{
		int[] alpha= new int[26];
		int l= s.length();
		List<Integer> ins= new ArrayList<Integer>();
		int i=0;
		//System.out.println(alpha);
		while(i<l)
		{
			if('a'<= s.charAt(i)&& s.charAt(i)<='z')
			{
				alpha[s.charAt(i)-'a']++;
				ins.add(s.charAt(i)-'a');
			}
			i++;
		}
		
		for(Integer j:ins)
		{
			if(alpha[j]==1)
			{
				char c=(char) (j+'a');
				System.out.print(c);
			}
		}
		
	}
	
//Function to check if first string is a subsequence of second
	
	public void checkSubsequence(String s1,String s2)
	{
	
		int l1=s1.length();
		int l2=s2.length();
		int j=0;
		for(int i=0;i<l2&&j<l1;i++)
		{
			if(s1.charAt(j)==s2.charAt(i))
				j++;
		}
		if(j==l1)
		{
			System.out.println("S1 is subsequence of S2");
		}
		
	}
}
