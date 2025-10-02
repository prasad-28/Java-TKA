package com.ka.erp.s1;
/*
123 123 123 
123 123 123 
123 123 123 
 */


public class Pattern1 {
	public static void main(String[] args) {
		for (int k = 1; k <= 3; k++) {
			for (int j = 1; j <= 3; j++) {
				for (int i = 1; i <= 3; i++) {
					System.out.print(i);
				}
				System.out.print(" ");
			}
			System.out.println();
		}
	}
}
