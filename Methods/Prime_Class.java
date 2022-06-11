package com.Methods;

public class Prime_Class {

	public  void prime(int x)
	   {
		for (int i = 2; i <= x; i++) {
			if (x%i == 0) {
				System.out.println("Not Prime");
				break;
			} else {
				System.out.println("Prime");
				break;
			}
		}
	}
}
