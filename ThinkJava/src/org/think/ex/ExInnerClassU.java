package org.think.ex;

interface InterfaceU {
	public void funcA();
	
	public void funcB();
	
	public void funcC();
}

class Execise22A {
	
	public InterfaceU makeInterfaceU() {
		return new InterfaceU() {
			public void funcA () {
				System.out.println("Anoymous Class funcA");
			}
			
			public void funcB () {
				System.out.println("Anoymous Class funcB");
			}
			
			public void funcC () {
				System.out.println("Anoymous Class funcC");
				Execise22A.this.invoke();
			}
		}; // must have a ';'
	}
	
	public void invoke() {
		System.out.println("Execise22A invoke");
	}
}

class Execise22B {
	
	public Execise22B () {
		
		arInterfaces = new InterfaceU[16];
	}
	
	public void addInterface(InterfaceU varInterface) {
		if (arInterfaces.length >= 16) {
			return;
		}
		else {
			arInterfaces[arInterfaces.length -1] = varInterface;
		}
	}
	
	public void clearInterface(int i) {
		if (i >= arInterfaces.length) {
			return;
		}
		arInterfaces[i] = null;
	}
	
	public void walkAll () {
		for (int i = 0; i < arInterfaces.length; i++) {
			arInterfaces[i].funcA();
			arInterfaces[i].funcB();
			arInterfaces[i].funcC();
		}
	}
	 

	private InterfaceU[] arInterfaces;

}

public class ExInnerClassU {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Execise22A arExercizeA[] = new Execise22A[12];
		Execise22B varExercizeB = new Execise22B();
		for (Execise22A varA : arExercizeA) {
			varExercizeB.addInterface(varA.makeInterfaceU());
		}
		
	}

}
