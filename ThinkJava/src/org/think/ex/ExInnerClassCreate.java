package org.think.ex;

public class ExInnerClassCreate {

	class Content {
		private int iValue = 11;
		
		public int value()
		{
			return iValue;
		}
		
	}
	
	//
	class Destination {
		private String strValue;
		public Destination(String strVal) {
			this.strValue = strVal;
		}
		
		String readLabel() {
			return strValue;
		}
	}
	
	Destination to(String strDest) {
		return new Destination(strDest);
	}
	
	Content getContent() {
		return new Content();
	}
	
	void ship(String strDest) {
		Content varContent = this.getContent();
		Destination varDest = this.to(strDest);
		System.out.println(varDest.readLabel());
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExInnerClassCreate varInnerShip = new ExInnerClassCreate();
		varInnerShip.ship("American");
	}

}
