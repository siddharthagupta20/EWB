package com.cg;

public class Emp_Wage_Builder {
	public static final int IS_PART_TIME=1;
	public static final int IS_FULL_TIME=2;
	public static final int EMP_RATE_PER_HOUR=20;
	public static final int NUM_OF_WORKING_DAYS=2;	
	public static final int MAX_HRS_IN_MONTH=10;	
	
	public static void main(String [] args) {

		int IS_FULL_TIME=1;
		int EMP_RATE_PER_HOUR=20;
		
		int empHrs=0;
		int empWage=0;
		double empCheck =Math.floor (Math.random()*10%2);
		if(IS_FULL_TIME==empCheck) {
			empHrs=8;
			
		}
		else {

			empHrs=0;
			}
		totalEmpHrs+=empHrs;
		
		System.out.println("Day#: "+ totalWorkingDays + " Emo Hr: "+ empHrs);
		
		}
		int totalEmpWage= totalEmpHrs+ EMP_RATE_PER_HOUR;
		System.out.println("Total Emp Wages: "+totalEmpWage);
		
	}
}