package com.ka.erp.s1;
/*
aaa bbb ccc 
aaa bbb ccc 
aaa bbb ccc 
 * */


public class Pattern2 {
	public static void main(String[] args) {

		int ch = 97;
		for (int k = 0; k < 3; k++) {
			for (int j = 0; j < 3; j++) {
				for (int i = 0; i < 3; i++) {
					System.out.print((char) (ch + j));
				}
				System.out.print(" ");
			}
			System.out.println();
		}
	}
}
