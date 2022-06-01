package codelab;

class Main {

	public static void testF() {
		// TODO(F): UPDATE ME
		// Write tests here to verify your custom method
		// in Robot.java
		assert false;
	}

	public static void main(String[] args){
		testA();
		testB();
		testC();
		testD();
		testE();
		testF();
	}
	
	private static void testA() {
		Robot robot = new Robot();
		assert robot != null;
	}

	private static void testB() {
		Robot robot = new Robot("bob", 10, 1);
		assert robot != null;
	}

	private static void testC() {
		Robot robot = new Robot("bob", 10, 1);
		
		robot.setName("jeff");
		robot.setBatteryCharge(5.0f);
		robot.setNumWheels(3);
		robot.setWheelPressure(new float[]{0.4f, 0.5f, 0.3f, 0.1f});

		String name = robot.getName();
		float batteryCharge  = robot.getBatteryCharge();
		int numWheels = robot.getNumWheels();
		float[] wheelPressure = robot.getWheelPressure();

		assert name.equals("jeff");
		assert batteryCharge == 5.0f;
		assert numWheels == 3;
		assert wheelPressure.equals(new float[]{0.4f, 0.5f, 0.3f, 0.1f});
	}

	private static void testD() {
		Robot robot = new Robot("joe", 4, 1);
		robot.drive(10, 0.1);
		assert robot.getBatteryCharge() == 11;
		assert robot.getWheelPressure().equals(new float[]{0.999f, 0.999f, 0.999f, 0.999f});
	}

	public static void testE() {
		Robot robot = new Robot("jake", 9, 1);
		assert robot.getWheelPressure();

		robot.drive(1000, 10000);

		assert !robot.getWheelPressure();
	}

}
