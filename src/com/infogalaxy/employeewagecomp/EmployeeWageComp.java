package com.infogalaxy.employeewagecomp;

import java.util.Scanner;

public class EmployeeWageComp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int attendance = 0;
		
		System.out.println("Enter [0 -Absent] / [1 -present]");
		
		attendance = sc.nextInt();
		
		if(attendance == 0) {
			System.out.println("Absent");
		} else {
			System.out.println("Present");
		}
		
	}

}
