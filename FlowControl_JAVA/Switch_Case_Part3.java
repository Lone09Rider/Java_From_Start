package com.FlowControl_JAVA;

public class Switch_Case_Part3 {
	public static void main(String[] args) {
		
		String name = "KirA";
		
		switch (name.toLowerCase()) {
		case "kira": {
			System.out.println("You Got KIRA");
			break;
		}
		case "mittu": {
			System.out.println("You Got MITTU");
			break;
		}
		default:
			System.out.println("Unexpected value: " + name);
		}
		
	}
}
