package com.javalec.ex;

public class Calculator {

	public void add(int f, int s) {
		System.out.println("add");
		int res = f + s;
		System.out.println(f + " + " + s + " = " + res);
	}
	
	public void sub(int f, int s) {
		System.out.println("sub");
		int res = f - s;
		System.out.println(f + " - " + s + " = " + res);
	}
	
	public void multi(int f, int s) {
		System.out.println("multi");
		int res = f * s;
		System.out.println(f + " * " + s + " = " + res);
	}
	
	public void div(int f, int s) {
		System.out.println("div");
		int res = f / s;
		System.out.println(f + " / " + s + " = " + res);
	}
	
	
}
