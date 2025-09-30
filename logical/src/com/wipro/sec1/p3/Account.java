package com.wipro.sec1.p3;
//Write a program to calculate average of three integer nos. 

public class Account {
	private double a;
	private double b;
	private double c;

	public Account() {
		super();
	}

	public Account(double a, double b, double c) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
	}

	public double calcAvg() {
		double avg = (a + b + c) / 3;
		return avg;
	}

	public double getA() {
		return a;
	}

	public void setA(double a) {
		if (a >= 0) {
			this.a = a;
		} else {
			//System.out.println("Amount should be >= 0");
		}

	}

	public double getB() {
		return b;
	}

	public void setB(double b) {
		this.b = b;
	}

	public double getC() {
		return c;
	}

	public void setC(double c) {
		this.c = c;
	}

	@Override
	public String toString() {
		return "Account [a=" + a + ", b=" + b + ", c=" + c + "]";
	}

}
