package Assignment;

public class uc2 {
	public static void main (String[] args) {
		int Fulltime = 1 ;
		int rate_per_hour= 20;
		int hours=0;
		int wage=0;
		double empcheck =Math.floor(Math.random()*10)%2 ;
		if(empcheck==Fulltime)
		{ hours=8;
		wage=hours*rate_per_hour;
			System.out.println("Emp Wage :" +wage);
		}
		else {
			System.out.println("Employee is Absent !");
		System.out.println("Emp Wage :" +wage);
		}

	}

}
