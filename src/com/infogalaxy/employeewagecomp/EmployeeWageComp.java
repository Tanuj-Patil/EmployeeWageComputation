package com.infogalaxy.employeewagecomp;

import java.util.Random;

public class EmployeeWageComp {
	    public static void main(String[] args) {
	        Random random = new Random();

	        int attendance;
	        int dailyWage;
	        int employee_type;
	        final int PART_TIME_HR = 4;
	        final int FULL_TIME_HR = 8;
	        final int WAGE_PER_HR = 20;
	        
	        attendance = random.nextInt(9) % 2;

	        switch (attendance) {
	            case 0:
	                System.out.println("Absent");
	                break;
	            
	            case 1:
	                System.out.println("Present");
	                employee_type = random.nextInt(9) % 2;
	                
	                if (employee_type == 0) {
	                    dailyWage = WAGE_PER_HR * PART_TIME_HR;
	                } else {
	                    dailyWage = WAGE_PER_HR * FULL_TIME_HR;
	                }
	                System.out.println("The wage of Employee is: " +dailyWage);
	                break;

	            default:
	                System.out.println("Enter correct data!");
	                break;
	        }
	    }
}