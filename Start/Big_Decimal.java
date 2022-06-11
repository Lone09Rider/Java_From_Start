package com.Start;

import java.math.BigDecimal;

public class Big_Decimal {

	public static void main(String[] args) {
		double x = 1.05;
		double y = 2.55;
		
		System.out.println(x+y);
		
		BigDecimal a = new BigDecimal(1.05);
		BigDecimal b = new BigDecimal(2.55);
		
		System.out.println(a.add(b));
		
		BigDecimal d1 = new BigDecimal("1.05");
		BigDecimal d2 = new BigDecimal("2.55");
		
		System.out.println(d1.add(d2));
		
	}
	
}
