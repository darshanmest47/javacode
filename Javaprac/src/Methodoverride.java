
public class Methodoverride {

	void method1() {
		System.out.println("This is a overrideable method");
		
	}
}

class Abc extends Methodoverride{
	
	public void method1() {
		System.out.println("This is a overriden method");
	}
	
	
	void simpletest() {
		super.method1();
	}
}
