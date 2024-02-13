package com.infogalaxy.employeewagecomp;

import java.util.Random;

public class EmployeeWageComp {

	public static void main(String[] args) {
		
		int attendance = 0;
		int dailyWage =  0;
		final int WAGE_PER_HR = 20;
		final int FULL_DAY_HR = 8;
		
//		Using Random class 
		Random random = new Random();
		
		attendance = random.nextInt(9)% 2;  // inside nextInt() we can provide Upper Bound value and %2 for 0 or 1 as result.

//		Using random() method of Math class which is static
//		attendance = (int) Math.floor(Math.random());
//		System.out.println(attendance);
		
		dailyWage = WAGE_PER_HR * FULL_DAY_HR;
		
		if(attendance == 0) {
			System.out.println("Absent");
		} else {
			System.out.println("Present");
			System.out.println("The total Wage of a worker is :" +dailyWage);
		}
		
	}

}
