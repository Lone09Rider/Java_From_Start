package com.FlowControl_JAVA;

public class Sum_Of_Digits  
{  
	public static void main(String arg[])  
	{  
		long number, sum;  
		System.out.print("Enter a number: ");  
		number=1234;  
		for(sum=0; number!=0; number=number/10)  
			{  
			sum = sum + number % 10;  
			}  
		System.out.println("Sum of digits: "+sum);  
	}  
}  