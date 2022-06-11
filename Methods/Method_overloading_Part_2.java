package com.Methods;

public class Method_overloading_Part_2 {

	public static int sum(int x, int y) {
		System.out.println("Adding 2 int Entities");
		return x+y;		
	}
	
	public static float sum(int x, float y) {
		System.out.println("Adding 1 int 1 Float Entities");
		return x+y;		
	}
	
	public static double sum(double x, double y) {
		System.out.println("Adding 2 Double Entities");
		return x+y;		
	}
	
	public static void main(String[] args) {
		System.out.println(sum(10, 20));
		System.out.println(sum(10, 0.5f));
		System.out.println(sum(10.8, 0.2));
	}
	
}
