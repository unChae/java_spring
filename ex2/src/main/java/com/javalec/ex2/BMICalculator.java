package com.javalec.ex2;

public class BMICalculator {

	private double lowWeight;
	private double nomal;
	private double overWeight;
	private double obesity;
	
	public void bmiCalculation(double weight, double height) {
		double h = height * 0.01;
		double res = weight / (h*h);
		
		System.out.println("BMI����: " + (int)res);
		
		if(res > obesity) {
			System.out.println("�� �Դϴ�.");
		}else if(res > overWeight) {
			System.out.println("��ü�� �Դϴ�.");
		}else if(res > nomal) {
			System.out.println("���� �Դϴ�.");
		}else {
			System.out.println("��ü�� �Դϴ�.");
		}

	}

	public void setLowWeight(double lowWeight) {
		this.lowWeight = lowWeight;
	}

	public void setNomal(double nomal) {
		this.nomal = nomal;
	}

	public void setOverWeight(double overWeight) {
		this.overWeight = overWeight;
	}

	public void setObesity(double obesity) {
		this.obesity = obesity;
	}
	
}
