package com.infogalaxy.employeewagecomp;

import java.util.Random;

public class EmployeeWageComp {
	    public static void main(String[] args) {
	        Random random = new Random();

	        int attendance;
	        int employee_type;
	        int dailyWage = 0;
	        final int PART_TIME_HR = 4;
	        final int FULL_TIME_HR = 8;
	        final int WAGE_PER_HR = 20;
	        final int MAX_WORKING_DAY_PER_MONTH = 20;
	        
	        for(int i = 1; i <= MAX_WORKING_DAY_PER_MONTH; i++) {	
	        	System.out.println("Day: " +i);
		        attendance = random.nextInt(9) % 2;
		        switch (attendance) {
		            case 0:
		                System.out.println("Absent");
		                break;
		            
		            case 1:
		                System.out.println("Present");
		                
		                employee_type = random.nextInt(9) % 2;
			                
			            if (employee_type == 0) {
			            	System.out.println("Part Time");
			                dailyWage = dailyWage + (WAGE_PER_HR * PART_TIME_HR);
			            } else {
			            	System.out.println("Full Time");
			                dailyWage = dailyWage + (WAGE_PER_HR * FULL_TIME_HR);
			            }
		                break;
	
		            default:
		                System.out.println("Enter correct data!");
		                break;
		        }
	        }    
	        System.out.println("The wage of Employee is: " +dailyWage);
	    }
}