package org.think.ex;

class WithFinals {
	protected final void finalMethod() {
		System.out.println("WithFinals::finalMethod!");
	}
	
	protected void noFinalMethod() {
		System.out.println("WithFinals::noFinalMethod!");
	}
}

//
public class ExFinalMethod extends WithFinals {

	// cannot overwrite
//	protected void finalMethod() {
//		System.out.println("ExFinalMethod::finalMethod!");
//	}
	
	public void noFinalMethod() {
		System.out.println("ExFinalMethod::noFinalMethod!");
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WithFinals oEx = new ExFinalMethod();
		oEx.finalMethod();
	}

}
