package com.Methods;

public class Method_overloading_Part_1 {
	
//	ARea of Square
	public static double area(double l, double b) {
		return l*b;
		
	}
	
	public static double area(double l) {
		return l*l;
		
	}
	
	public static int area(int l) {
		return l*l;
		
	}
	
	public static void main(String[] args) {
		System.out.println(area(5, 5));
		System.out.println(area(5));
		System.out.println(area(5));
	}

}
