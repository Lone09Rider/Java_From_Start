package com.FlowControl_JAVA;

public class Break_Continue {
	
	public static void main(String[] args) {
		
		for(int i = 1; i <= 10; i++)
		{
			System.out.println(i);
			if (i == 5) {
				break;
			}
		}
		
		System.out.println("__________________");
		
		for(int i = 1; i <= 10; i++)
		{
			if (i == 3) {
				continue;
			}
			System.out.println(i);
		}
	}
	
}
