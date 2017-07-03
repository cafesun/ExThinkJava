package org.think.ex;


public class ExGreenHouseController  extends ExController {

	private boolean light = false;
	private boolean water = false;
	private String themostat = "day";
	
	// class lightOn
	public class LightOn extends Event {	
		public LightOn(long delayTime) {
			super(delayTime);
		}
		public void action() {
			light = true;
		}
		public String toString() {
			return "Light is On";
		}
	}
	
	// class LightOff
	public class LightOff extends Event {
		public LightOff(long delayTime) {
			super(delayTime);
		}
		public void action() {
			light = false;
		}
		public String toString() {
			return "Light is Off";
		}
	}
	
	// class WaterOn
	public class  WaterOn extends Event {
		public WaterOn(long delayTime) {
			super(delayTime);
		}
		public void action() {
			water = true;
		}
		public String toString() {
			return "Water is On";
		}
	}
	
	// class WaterOff
	public class  WaterOff extends Event {
		public WaterOff(long delayTime) {
			super(delayTime);
		}
		public void action() {
			water = false;
		}
		public String toString() {
			return "Water is Off";
		}
	}
	
	// class ThemostAtDay
	public class  ThemostAtDay extends Event {
		public ThemostAtDay(long delayTime) {
			super(delayTime);
		}
		public void action() {
			themostat = "Day";
		}
		public String toString() {
			return "ThemostAt is Day";
		}
	}
	
	// class ThemostAtNight
	public class  ThemostAtNight extends Event {
		public ThemostAtNight(long delayTime) {
			super(delayTime);
		}
		public void action() {
			themostat = "Night";
		}
		public String toString() {
			return "ThemostAt is Night";
		}
	}
	
	// class Bell
	public class  Bell extends Event {
		public Bell(long delayTime) {
			super(delayTime);
		}
		public void action() {
			addEvent(new Bell(delayTime));
		}
		public String toString() {
			return "Bing!";
		}
	}
	
	// class Restart
	public class  Restart extends Event {
		private Event[] eventList;
		public Restart(long delayTime, Event[] eventList) {
			super(delayTime);
			this.eventList = eventList;
			for (Event e : eventList) {
				addEvent(e);
			}
		}
		public void action() {
			for (Event e: eventList) {
				e.start(); // 从Restart的成员变量eventList中取出要执行的Event对象，重新设定时间，然后调用基类addEvent方法
				addEvent(e);
			}
			start(); // 重新设定Restart对象的时间
			addEvent(this);
		}
		public String toString() {
			return "Restarting System";
		}
		
	}
	
	public static class Terminate extends Event {
		Terminate(long delayTime) {
			super(delayTime);
		}
		public void action() {
			System.exit(0);
		}
		
		public String toString() {
			return "Terminating...";
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExGreenHouseController gc = new ExGreenHouseController();
		gc.addEvent(gc.new Bell(900));
		Event[] eventList = {
				gc.new ThemostAtNight(0),
				gc.new LightOn(200),
				gc.new LightOff(300),
				gc.new WaterOn(400),
				gc.new WaterOff(600),
				gc.new ThemostAtDay(1400)
		};
		gc.addEvent(gc.new Restart(2000, eventList));
		if (args.length == 1) {
			gc.addEvent(new ExGreenHouseController.Terminate(
					new Integer(args[0])));
		}
		gc.run();
	}

}
