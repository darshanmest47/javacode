
public class Nonaccess {
// static context can only access static things to access non static we need to create objects
	
	public static void main(String[] args) {
	main1();
	new Nonaccess().main2();
		
	}
	
	String s12 ="Darshan";
	static int a =200;
	double b =201.00;
	final int val=420;


	 static void main1(){
		  System.out.println(new Nonaccess().s12); // if static is removed from method it will result in an error
//		  System.out.println(s12);  error static can access only static
		  System.out.println(a); // here type of a is changed to static else will be an error
		  
	  }
	 
	 void main2() {
		 System.out.println(s12);
		 System.out.println(a);
		 System.out.println(b);
//		 
//		val = 430;  error bcz once declared final we cannot chnage the value or reassign value to the variable
		
	 }
	


}
