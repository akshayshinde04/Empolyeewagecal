package pratice;

public class Employeewagecal {
	public static void main(String[] args) { 
	
		int empWage;
		int empRatePerHr = 20;
		int emphour = 0;
		int wage_per_hour = 20;
		int empDay = 20;
	
		 int empCheck = (int)(Math.random()*10) % 3;
	       switch(empCheck)
	       {
	       case 1: 
	    	  emphour = 4;
	          break;
	      case 2:
	    	  emphour = 8;
	    	 break;
	      default :
		      emphour = 0;
	       }
		empWage = emphour * empRatePerHr;
		System.out.println("Emp Wage "+ empWage);
		empDay = empWage * empDay;
		System.out.println("Emp Day Per Month  " + empDay);
		
    }
 
}	