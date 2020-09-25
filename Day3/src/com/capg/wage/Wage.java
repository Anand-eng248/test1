package com.capg.wage;

public class Wage {
	public static final int PartTime=1;
	public static final int FullTime=2;
	public static final int EmpRatePerHour=20; 
	public static void main(String[] args) {
		System.out.println("Welcome to Employee Computation");
		int attendance=(int) Math.floor(Math.random()*10)%3;
		int empwage=0;
		int workingHours=0;
		int countOfDays=0;
		int totalwage=0;
		for(int i=0;i<=20;i++) {
			if(workingHours<=100) {
				switch(attendance) {
				case PartTime:
					workingHours=4;
					break;
				case FullTime:
					workingHours=8;
					break;
					default:
					workingHours=0;
			}
				empwage=workingHours*20;
			}
			totalwage+=empwage;
		}
		System.out.println("Emp wage  "+totalwage);
	}
}