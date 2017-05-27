package org.think.ex;

class BlankFinal {
	
	public BlankFinal(int iValue) {
		System.out.printf("BlankFinal(%d)\n", iValue);
		this.iValue = iValue;
	}
	
	public BlankFinal(String strValue) {
		System.out.printf("BlankFinal(%s)\n", strValue);
		this.strValue = strValue;
	}
	
	private int iValue;
	private String strValue;
}

public class ExBlankFinal {
	
	private final BlankFinal oBlankFinal;
	
	public ExBlankFinal(int iValue) {
		oBlankFinal = new BlankFinal(iValue);
	}
	
	public ExBlankFinal(String strValue) {
		oBlankFinal = new BlankFinal(strValue);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExBlankFinal oExA = new ExBlankFinal(2012);
		ExBlankFinal oExB = new ExBlankFinal("Hellow World!");
	}

}
