package com.javalec.ex2;

import java.util.ArrayList;

public class MyInfo {
	private String name;
	private double height;
	private double weight;
	private ArrayList<String> hobby;
	private BMICalculator bmiCalculator;
	
	public void setName(String name) {
		this.name = name;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public void setHobby(ArrayList<String> hobby) {
		this.hobby = hobby;
	}
	public void setBmiCalculator(BMICalculator bmiCalculator) {
		this.bmiCalculator = bmiCalculator;
	}
	
	public void bmiCalculation() {
		bmiCalculator.bmiCalculation(weight, height);
	}
	public void getInfo() {
		System.out.println("�̸�" + name);
		System.out.println("Ű" + height);
		System.out.println("������" + weight);
		System.out.println("���" + hobby);
		bmiCalculation();
	}
}
