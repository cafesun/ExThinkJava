package org.think.ex;

public class ExFinalParam {

	private int iSelfValue;
	
	public void getValue(int iValue) {
		iValue = this.iSelfValue;
	}
	
	public void setValue(final int iValue) {
		//iValue = 100;
		this.iSelfValue = iValue;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExFinalParam oEx = new ExFinalParam();
		oEx.setValue(100);
		int iValue = -1;
		oEx.getValue(iValue);
		System.out.println(iValue);
	}

}
