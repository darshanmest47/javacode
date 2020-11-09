
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Second s1 = new Second();
		
		s1.disp2();
		Second.disp1(); //static and can be accessed using classname of inherited class
		First.disp1();  //static and can be accessed using classname of the class in which it is declared
        
		System.out.println(s1.a); // can be accessed using instance
		System.out.println(Second.a); // can be accessed using classname.variablename of inherited class
		System.out.println(First.a); // can be accessed using classname.variablename of  class in which inherited
	}

}
