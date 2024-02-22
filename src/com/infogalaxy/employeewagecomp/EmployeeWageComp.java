package com.infogalaxy.employeewagecomp;

import java.util.Random;

public class EmployeeWageComp {
	
	int attendance;
    int employee_type;
    int dailyWage = 0;
    int total_wage = 0;
    int total_workingHr = 0;
    int total_workingDays = 1;
    int wage_per_hr;
    int max_working_days_per_month;
    int max_working_hr;
    final int PART_TIME_HR = 4;
    final int FULL_TIME_HR = 8;
    
    public void employeeWageCalc() {
    	System.out.println("------------------");
    	System.out.println("Welcome to the Employee Wage Computation program!");
    	System.out.println("------------------");
    	
	    while((total_workingHr <= max_working_hr) && (total_workingDays <= max_working_days_per_month)) {
	    	System.out.println("Day: " +total_workingDays);
	        	
	        Random random = new Random();
		    attendance = random.nextInt(9) % 2;
		    switch (attendance) {
		        case 0:		        	System.out.println("Absent");
		            break;
		            
		        case 1:
		            System.out.println("Present");
		            employee_type = random.nextInt(9) % 2;
			                
		            switch(employee_type) { 
		            	case 0:
				            System.out.println("Employee is Part Time");
				            dailyWage = wage_per_hr * PART_TIME_HR;
				            total_workingHr += PART_TIME_HR;
				            break;
			            
		            	case 1:
				            System.out.println("Employee is Full Time");
				            dailyWage = wage_per_hr * FULL_TIME_HR;
				            total_workingHr += FULL_TIME_HR;
				            break;
		            }
		            total_wage += dailyWage;
		            System.out.println("Employee Wage: " +dailyWage);
		            break;
		    }
		    System.out.println("------------------");
		    total_workingDays++;
	    
	    }    
	    System.out.println("The Total Working Days : " +(total_workingDays-1));
		System.out.println("The Total Working Hours: " +total_workingHr);
	    System.out.println("The  wage of Employee is: " +total_wage);
	}
	    
    	
    public EmployeeWageComp(int wage_per_hr, int max_working_days_per_month, int max_working_hr) {
    	super();
    	this.wage_per_hr = wage_per_hr;
    	this.max_working_days_per_month = max_working_days_per_month;
    	this.max_working_hr = max_working_hr;
    }
    
	public static void main(String[] args) {
		EmployeeWageComp employeewagecomp = new EmployeeWageComp(20, 20, 100);
		EmployeeWageComp employeewagecomp2 = new EmployeeWageComp(18, 10, 54);
	    employeewagecomp.employeeWageCalc();
	    employeewagecomp2.employeeWageCalc();
	    
	}
}