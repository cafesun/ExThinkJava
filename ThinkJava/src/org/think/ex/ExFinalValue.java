package org.think.ex;

public class ExFinalValue {
	
	private final int iValue = 10;
	
	private static final int CONST_VALUE = 100;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExFinalValue oValue = new ExFinalValue();
		//oValue.iValue = 120;
		System.out.println("iValue = " + oValue.iValue);
		System.out.println("CONST_VALUE = " + ExFinalValue.CONST_VALUE);
	}

}
