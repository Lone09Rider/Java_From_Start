package com.FlowControl_JAVA;

import java.util.Scanner;

public class Switch_Case {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a Number : ");
		
		int x = sc.nextInt();
		int y = 9;

		switch (x) {
		case 1: {
			System.out.println("Value is One");
			break;
		}
		case 2: {
			System.out.println("Value is 2");
			break;
		}
		default:
			System.out.println("Value is : " + y);
		}
	}
}
