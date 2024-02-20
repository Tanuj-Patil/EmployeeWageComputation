package com.infogalaxy.employeewagecomp;

import java.util.Random;

public class EmployeeWageComp {
	    public static void main(String[] args) {
	        Random random = new Random();

	        int attendance;
	        int employee_type;
	        int dailyWage = 0;
	        int total_wage = 0;
	        int workingHr = 0;
	        int workingDays = 1;
	        final int PART_TIME_HR = 4;
	        final int FULL_TIME_HR = 8;
	        final int WAGE_PER_HR = 20;
	        final int MAX_WORKING_DAY_PER_MONTH = 20;
	        final int MAX_WORKING_HR = 100;
	        
	        while((workingHr <= MAX_WORKING_HR) && (workingDays <= MAX_WORKING_DAY_PER_MONTH)) {
	        	System.out.println("Day: " +workingDays);
		        attendance = random.nextInt(9) % 2;
		        switch (attendance) {
		            case 0:
		                System.out.println("Absent");
		                break;
		            
		            case 1:
		                System.out.println("Present");
		                employee_type = random.nextInt(9) % 2;
			                
		                switch(employee_type) { 
			            	case 0:
				            	System.out.println("Employee is Part Time");
				            	dailyWage = WAGE_PER_HR * PART_TIME_HR;
				                workingHr += PART_TIME_HR;
				                break;
			            	case 1:
				            	System.out.println("Employee is Full Time");
				                dailyWage = WAGE_PER_HR * FULL_TIME_HR;
				                workingHr += FULL_TIME_HR;
				                break;
			            }
		                total_wage += dailyWage;
		                System.out.println("Employee Wage: " +dailyWage);
		                break;
	
		        }
		        System.out.println("------------------");
		        workingDays++;
	        }    
	        System.out.println("The Total Working Days : " +(workingDays-1));
		    System.out.println("The Total Working Hours: " +workingHr);
	        System.out.println("The  wage of Employee is: " +total_wage);
	    }
}