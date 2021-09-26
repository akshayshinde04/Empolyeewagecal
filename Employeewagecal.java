package pratice;

public class Employeewagecal {
	public static void main(String[] args) { 
		int part_time_hour,wage_per_hour =20,Cal,full_day;
		
		 int N = (int)(Math.random()*10) % 3;
       switch(N)
       {
       case 1: 
    	  part_time_hour = 4;
    	  Cal =  part_time_hour * wage_per_hour;
    	System.out.println(Cal);
     	   break;
      case 2:
    	  full_day = 8;
    	  Cal =  wage_per_hour * full_day;
    	System.out.println(Cal);
    	 break;
      default : System.out.println("zero salary");
     
    }
  }
}	