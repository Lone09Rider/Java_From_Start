package com.Methods;

public class Methos_How {
	public static void main(String[] args) {
		
		loop1(5, 9);
		System.out.println("*********************");
		loop2();
		
	}
	
	public static void loop1(int step, int finalval)
	{	
		while (step <= finalval)
		{
			System.out.println(step);
			step++;
		}
	}
	
	public static void loop2()
	{
		int j = 10;
		
		while (j <= 20)
		{
			System.out.println(j);
			j++;
		}
	}
	
}
