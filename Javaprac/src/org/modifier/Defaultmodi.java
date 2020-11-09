package org.modifier;

public class Defaultmodi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//default is public in same package and private in other packages
		Defaultcl def = new Defaultcl();
		
		System.out.println(def.a1);
		System.out.println(def.s1);
		def.disp1();

	}

}
