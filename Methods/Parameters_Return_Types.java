package com.Methods;

public class Parameters_Return_Types{
	
	public static void main(String[] args) {
		
		double d = areaRectangle(2, 4.2);
		System.out.println(d);
		
	}
	
	public static double areaRectangle(double length, double width) 
	{
		return width*length;
	}

}
