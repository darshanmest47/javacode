package org.modifier;

public class Defaultcl {
	
	//default is public in same package and private in other packages
	
	protected static  String s1 = "default";
	protected static int a1 =200;
	protected static String s11 ="protected";
   protected static String s12 ="public";
	
   protected static void disp1() {
		System.out.println("i am a default method disp1");
	}
	
	 protected static  void disp2() {
		System.out.println("I am a default method");
	}

}
