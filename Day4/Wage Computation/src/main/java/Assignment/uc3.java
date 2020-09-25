package Assignment;

public class uc3 {
	public static void main(String[] args) {
		int Fulltime = 2;
		int Parttime = 1;
		int rate_per_hour= 20;
		int hours=0;
		int empwage=0;
		double empcheck =Math.floor(Math.random()*10)% 3 ;
		if(empcheck==Fulltime)
			hours=8;
		else if(empcheck==Parttime)
			hours=4;
		else
			hours=0;
		empwage=hours*rate_per_hour;
		System.out.println("Emp Wage :" +empwage);
	}

}
