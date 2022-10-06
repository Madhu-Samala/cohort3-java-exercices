package com.qa.java.exercises;

public class DataTypes {

	public static void main(String[] args) {
		float salary ;
		salary = 35000;
		float incrementedPercentage;
		incrementedPercentage = 12.5f;
		
		float incrementedSalary;
		incrementedSalary = (float) (salary * incrementedPercentage / 100);
		
		salary += incrementedSalary;
		
		System.out.println("Updated Salary : " + salary);
		
		float applePricePerKg = 3.25f;
	//	float appleDiscountPrice = (applePricePerKg * (10 / 100) );
		float appliePricePerKgAfterDiscount;
		appliePricePerKgAfterDiscount = applePricePerKg - (applePricePerKg * 10 / 100 );
		System.out.println(appliePricePerKgAfterDiscount);

	}

}
