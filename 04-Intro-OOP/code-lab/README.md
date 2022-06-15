# Code Lab: 04 - Intro to OOP

## Description

In this codelab you will practice some of the concepts of Object Oriented Programming
and get exposed to some exaggerated situations where these cases can be used. Furthermore,
you will start practicing writing your own tests. There is a unit for ted driven development
later in this guide, which will help you in the future, but for now, just stick to testing anything
and everything you can think of. Tests help developers verify code is working without needing to 
run the code. Tests can sometimes be tedious; however, they are a great way to verify code is working
and hasn't broken. Especially when multiple developers are working together at the same time.

### Tasks

1. In `codelab/src`, create a new abstract Java class called `Vehicle.java`.
  In this method, create some properties a vehicle might have such as:

    - `public String color`
    - `private int numberOfWheels`
    - `private long registrationNumber`
    - `public float miles`

    In addition, define some methods a vehicle might have such as:

    - `public void travel(float traveledMiles)`: this method will define what happens when the vehicle travels `traveledMiles`
    - `public void paint(String newColor)`: this method will define what happens when the vehicle is painted

2. In `codelab/src`, create a new Java class `Car.java`, which inherits from `Vehicle.java`.
  Be sure to set the variables appropriately using well defined constructors and overloading. Furthermore,
  be sure to implement the abstract methods defined in the abstract class. In addition, add the following:

    - `public float gas`: how much gas the vehicle has
    - Override the `Vehicle.java#travel()` method. Inside this method, call the Vehicle definition and then subtract 0.95 gallons for every mile traveled.

3. In `codelab/src/Main.java`, implement the "test" functions to the best of your ability to verify that your program compiles and that you get the expected results. Consider using `assert()` to verify that your program does that you expect. 

4. When you have run out of ideas to test:
  - Stage your changes
  - Commit your changes appropriately
  - submit a pull request from your branch
5. Keep an eye on your pull request, update, and changes requested

**NOTE:** Your pull request will not be accepted, but it is important you
keep in mind any feedback proposed as well as changes requested!
