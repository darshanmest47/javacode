
public abstract class Abstractcl {
	
	abstract void disp1() ;
	
	void disp2() {
		System.out.println("non abstarct");
	}

}



 class Abs extends  Abstractcl{

	@Override
	void disp1() {
		System.out.println("overridden");
		
	}
	
}
