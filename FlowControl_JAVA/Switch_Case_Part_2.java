package com.FlowControl_JAVA;

public class Switch_Case_Part_2 {
	public static void main(String[] args) {
		
		char c = 'a';
		
		switch (c) {
		case 'b': {
			System.out.println("b");
		}
		
		case 'c': {
			System.out.println("c");
		}
		
		default:
			System.out.println("Expected value: " + c);
		}
		
	}
}
