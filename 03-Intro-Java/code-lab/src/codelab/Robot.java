package codelab;

class Robot {
	// TODO(A): Create private variables
	// variable called "name" of type String
	// variable called "batteryCharge" of type float as 12
	// variable called "numWheels" of type int
	// variable called "wheelPressure" of type []float initially set to 1

	private int id;	

	// TODO(B): Create a constructor method for Robot that 
	// takes a name, age, and id. It should assign all member variables
	

	// Creates a robot with a default id=0
	public Robot(String name, int age) {
		this(name, age, 0);
	}

	// Creates a robot with the defaults age=0 and id=0
	public Robot(String name) {
		this(name, 0, 0);
	}

	// Creates a robot with the defaults name="default", age=0, and id=0
	public Robot() {
		this("default", 0, 0);
	}

	// TODO(C): Create getters/setters for all private member variables
	

	// TODO(D): Implement the following drive method
	// Reduce batteryCharge by voltage * timeMS
	// Reduce wheelPressure by 0.01 * time for every wheel
	public void drive(float voltage, float time) {

	}

	// TODO(E): Check pressure should return false
	// the wheel pressure for any wheel is <= 0.4
	// REQUIREMENT: MUST use a for loop
	public bool checkPressure() {

	}

	// TODO(F): Write your own new, additional method
	// here and create tests for it in Main.java
}
