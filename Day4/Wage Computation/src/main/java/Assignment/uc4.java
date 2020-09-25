package Assignment;

public class uc4 {
	
	public static final int Fulltime=2;
	public static final int Parttime=1;
	public static final int Emp_rate_per_hour=20;
		public static void main(String[] args) {
			int hours=0;
			int wage=0;
			double empcheck =Math.floor(Math.random()*10)% 3;
			switch((int)empcheck) {
			case Parttime :hours=4;
			break;
			case Fulltime :hours=8;
			break;
			default: hours=0;
			}
			wage=hours*Emp_rate_per_hour;
			System.out.println("Emp Wage :" +wage);
}

}
