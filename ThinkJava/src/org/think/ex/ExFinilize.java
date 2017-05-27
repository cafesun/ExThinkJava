package org.think.ex;

class Book {
	boolean bCheckout = false;
	
	Book(boolean bCheckout) {
		this.bCheckout = bCheckout;
	}
	
	void checkIn() {
		this.bCheckout = false;
	}
	
	protected void finalize() {
		if (this.bCheckout) {
			System.out.println("Error Book Checkout!");
		}
		else {
			System.out.println("Success!");
		}
			
	}
}

public class ExFinilize {

	public static void main(String[] args) {
		Book varBook = new Book(true);
		varBook.checkIn();
		new Book(true);
		System.gc();
		return;
	}

}
