package com.infy.oops;

public class Client {
	public static void main(String[] args) {
		Student s1 = new Student();
		Student s2 = new Student(101, "Ankit", "ME");
		
		Client c1 = new Client();
		System.out.println(s1);
		System.out.println(s2);
	}
}
