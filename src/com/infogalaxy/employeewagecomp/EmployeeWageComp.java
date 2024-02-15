package com.infogalaxy.employeewagecomp;

import java.util.Random;

public class EmployeeWageComp {

	public static void main(String[] args) {
		
		int attendance;
		int dailyWage;
		int employee_type;
		final int WAGE_PER_HR = 20;
		final int PART_TIME_HR = 4;
		final int FULL_TIME_HR = 8;
		
//		Using Random class 
		Random random = new Random();
		
		attendance = random.nextInt(9)% 2;  // inside nextInt() we can provide Upper Bound value and %2 for 0 or 1 as result.

//		Using random() method of Math class which is static
//		attendance = (int) Math.floor(Math.random());
//		System.out.println(attendance);
		
		if(attendance == 0) {
			System.out.println("Absent");
		} else {
			System.out.println("Present");
			employee_type = random.nextInt(9)% 2;
			if(employee_type == 0) {
				dailyWage = WAGE_PER_HR * PART_TIME_HR;
			} else {
				dailyWage = WAGE_PER_HR * FULL_TIME_HR;
			}
			System.out.println("The total Wage of a worker is :" +dailyWage);
		}
		
	}

}
