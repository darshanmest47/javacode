
public class Superconcept {
	
	int a = 10;
	
	Superconcept(){
		System.out.println("I am a Simple constructor from Superconcept called by A()"); 
		
	}
	
	Superconcept(int a){
		this.a =a;
		System.out.println("I am a parameterized constructor from Superconcept called by A(int a) with int "+ a);
	}
	
	static void disp1() {
		System.out.println("static disp1");
	}
	
	void disp1(int a) {
		System.out.println("non static disp1 with value "+a);
	}

}

class A extends Superconcept{
	A(){
		System.out.println("simple from A called by B()");  //by default calls A() of Superconcept class
	}
	
	A(int a){
		super(a);
		System.out.println("parameterized from A called by B(int a) with "+a); // called by B(int a)
	}
}

class B extends A{
	B(){
		
		
		System.out.println("simple from B calling A()");
		
	} // by default calls A() of super class
	
	B(int a){
		super(a);
	System.out.println("I will call parent A(int a) constructor with value "+a+" "+"from B");
	}
	
	void testB() {
		super.disp1(20);
		super.disp1();
	}
}
