package org.think.ex;

class InitializeValue {
	
	boolean bVar;
	byte byVar;
	char cVar;
	short shVar;
	int iVar;
	long lVar;
	float fVar;
	double dVar;
	InitializeValue vRef;
	
	void Print() {
		System.out.println("bVar = " + bVar);
		System.out.println("byVar = " + byVar);
		System.out.println("cVar = " + cVar);
		System.out.println("shVar = " + shVar);
		System.out.println("iVar = " + iVar);
		System.out.println("lVar = " + lVar);
		System.out.println("fVar = " + fVar);
		System.out.println("dVar = " + dVar);
		System.out.println("vRef = " + vRef);
	}
	
}

class InitializeWithValue {
	boolean bVar = true;
	byte byVar = 127;
	char cVar = 'x';
	short shVar = 32767;
	int iVar = -2;
	long lVar = 21234;
	float fVar = 3.1f;
	double dVar = 3.1415926;
	//InitializeValue vRef;
	
	void Print() {
		System.out.println("bVar = " + bVar);
		System.out.println("byVar = " + byVar);
		System.out.println("cVar = " + cVar);
		System.out.println("shVar = " + shVar);
		System.out.println("iVar = " + iVar);
		System.out.println("lVar = " + lVar);
		System.out.println("fVar = " + fVar);
		System.out.println("dVar = " + dVar);
		//System.out.println("vRef = " + vRef);
	}
}

public class ExInitializeValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InitializeValue oValue = new InitializeValue();
		oValue.Print();
		
		InitializeWithValue oValue2 = new InitializeWithValue();
		oValue2.Print();

	}

}
