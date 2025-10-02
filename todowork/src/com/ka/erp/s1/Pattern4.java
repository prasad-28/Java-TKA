package com.ka.erp.s1;

/*
123 abc 789 
123 abc 789 
123 abc 789 
 */

public class Pattern4 {
	public static void main(String[] args) {
		int ch = 97;
		for (int n = 0; n < 3; n++) {
			int d = -1;
			for (int i = 1; i <= 9; i++) {
				if (i >= 4 && i <= 6)
					System.out.print((char) (ch + ++d));
				else {
					System.out.print(i);
				}
				if (i % 3 == 0) {
					System.out.print(" ");
				}

			}

			System.out.println();
		}
	}

}
