package org.think.ex;


// 接口类
interface Incrementable {
	void increment();
}

// 继承于接口的被调用者
class CalleeI implements Incrementable {
	
	private int i = 0;
	public void increment() {
		System.out.printf("Callee1::increment i= %d", i++);
	}
}

// 自定义类，覆盖increment接口
class MyIncrement {
	
	public void increment() {
		System.out.println("MyIncrement increment!");
	}
	
	public static void func(MyIncrement varIncrement) {
		varIncrement.increment();
	}
}

//非继承于接口的被调用者
class CalleeNI extends MyIncrement {
	private int i = 0;
	
	public void increment() {
		super.increment();
		System.out.printf("Callee2::increment i = %d\n", i);
		i++;
	}
	
	private class Closure implements Incrementable {
		public void increment() {
			CalleeNI.this.increment();
		}
	}
	
	Incrementable getCallback() {
		return new Closure();
	}
}

class Caller {
	private Incrementable varCallback;
	
	public Caller(Incrementable varCB) {
		varCallback = varCB;
	}
	
	public void onCallback() {
		varCallback.increment();
	}
}

public class ExClosureCallbck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CalleeI varCalleeI = new CalleeI();
		CalleeNI varCalleeNI = new CalleeNI();
		MyIncrement.func(varCalleeNI);

		Caller varCallerA = new Caller(varCalleeI);
		Caller varCallerB = new Caller(varCalleeNI.getCallback());// Closure 继承自Increment;
		
		
	}

}
