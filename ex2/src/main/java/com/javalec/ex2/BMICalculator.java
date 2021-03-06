package com.javalec.ex2;

public class BMICalculator {

	private double lowWeight;
	private double nomal;
	private double overWeight;
	private double obesity;
	
	public void bmiCalculation(double weight, double height) {
		double h = height * 0.01;
		double res = weight / (h*h);
		
		System.out.println("BMI지수: " + (int)res);
		
		if(res > obesity) {
			System.out.println("비만 입니다.");
		}else if(res > overWeight) {
			System.out.println("과체중 입니다.");
		}else if(res > nomal) {
			System.out.println("정상 입니다.");
		}else {
			System.out.println("저체중 입니다.");
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
