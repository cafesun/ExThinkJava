package org.think.ex;

interface InterfaceU {
	public void funcA();
	
	public void funcB();
	
	public void funcC();
}

class Execise22A {
	
	public Execise22A() {
		
	}
	
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
		iCount = 0;
	}
	
	public void addInterface(InterfaceU varInterface) {
		if (iCount >= arInterfaces.length) {
			return;
		}
		else {
			arInterfaces[iCount++] = varInterface;
		}
	}
	
	public void clearInterface() {
		int iSize = iCount;
		for (int i = 0; i < iSize; i++) {
			arInterfaces[i] = null;
			iCount--;
		}
	}
	
	public void walkAll () {
		for (int i = 0; i < arInterfaces.length; i++) {
			if (arInterfaces[i] == null) {
				continue;
			}
			arInterfaces[i].funcA();
			arInterfaces[i].funcB();
			arInterfaces[i].funcC();
		}
	}
	 

	private InterfaceU[] arInterfaces;
	
	private int iCount;

}

public class ExInnerClassU {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Execise22A[] arExercizeA = new Execise22A[12];
		for (int i = 0; i < arExercizeA.length; i++) {
			arExercizeA[i] = new Execise22A();
		}
		Execise22B varExercizeB = new Execise22B();
		for (Execise22A varA : arExercizeA) {
			varExercizeB.addInterface(varA.makeInterfaceU());
		}
		varExercizeB.walkAll();
		
	}

}
