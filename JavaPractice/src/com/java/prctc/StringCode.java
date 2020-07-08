package com.java.prctc;

import java.time.LocalDate;
import static java.lang.System.out;
import java.util.Arrays;
import java.util.List;

public class StringCode {

	/**
	 * @param args
	 */
	
	public boolean checkAnagram(String str)
	{
		
		boolean[] alpha = new boolean[26];
		
		str= str.toLowerCase();
		System.out.println(str);
		for(int i=0;i<str.length();i++)
		{
			if('a'<= str.charAt(i)&& str.charAt(i)<='z')
			{
			int index= str.charAt(i)-'a';
			System.out.println("Index::"+index);
			alpha[index]=true;
			}
			else continue;
			
			
		}
		for(int j=0;j<alpha.length;j++)
		{
			if(!alpha[j])
			{return false;}
			
		}
		return true;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringCode sc= new StringCode();
		/*String str= "The quick brown fox jumps over the lazy dog";
		if(sc.checkAnagram(str))
		{
			System.out.println("String is Panagram");
		}
		
		else {System.out.println("No");}
		*/
		
		LocalDate ld= LocalDate.now();
		//System.out.println("current date::"+ld);
		List<Integer> la= Arrays.asList(2,3,4,5,6,7,9);
		//la.forEach(i->System.out.println(i));

		DuplRearrange dup= new DuplRearrange();
	/*	int flag= dup.checkSumString("1111112223");
		if(flag==0)
		{
			System.out.println("Not a sum string");
		}*/
		//String newStr=dup.newString("bbbaa");
		//System.out.println("Found::"+newStr);
		String as="geeks for geeks";
		dup.checkSubsequence("axy", "daxcpy");
		
		
	}

}
