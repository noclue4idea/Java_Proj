package com.prtc;

public class OverDemo2 {
	
	public static void sum(int a, int b) throws NumberFormatException
	{
		System.out.println("Parent Sum= ");
		try{
			int l= Integer.valueOf("67");
			System.out.println("Value of: "+l);
			
			
		}
		
		catch(NumberFormatException ex){
			
			System.out.println("Change your input");
		}
	}

	public void throwExp(int k) throws CustomException
	{
	
		try{
			int l= Integer.valueOf("67h");
			System.out.println("Value of: "+l);
			
		}
		
		catch(NumberFormatException ex){
			
			System.out.println("Change your input");
		}
		
		catch (Exception e){
			//System.out.println("Printing message : ");
			//e.printStackTrace();
			throw new CustomException("Inside Parent Class", e);
		}
		if(k>6)
		{
			//throw new ArithmeticException("Value is not valid");
		}
		
		
	}
}
