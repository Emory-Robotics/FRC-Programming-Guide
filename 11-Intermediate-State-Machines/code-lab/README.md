# Code Lab: 11 - Intermediate State Machines

## Description

In this codelab, you will practice designing your very own
state machine. Using Google's [diagram.net](https://www.diagrams.net).

Create a new diagram and design a state machine for an Elevator!

No, not a public elevator that carries people. An FRC Elevator!
An elevator is usually used to move a superstructure up and down to
varying heights ([example of an FRC Elevator](https://www.youtube.com/watch?v=XpPDtvDJXlU)) 

### Tasks

#### Diagram

Start by creating the Elevator state machine finite automata. 
Your diagram should include conditions that cause transitions
across the following five states:

- `UNKNOWN`
- `CALIBRATING`
- `LOW`
- `MID`
- `HIGH`

When creating the diagram, think about the Controller inputs 
and how they can trigger these states?

Additionally, you should indicate a fault state (also
defined as the `UNKNOWN` state) and any conditions which
might trigger this state.

#### Code

Once you have the diagram designed, get approval from a lead or
mentor (you can also post an issue in this thread to get feedback
from me :)).

Once you have the okay, begin by:

  - Create a new robot project
  - Create a new `ElevatorSubsystem.java` class
    - Implement your states by creating a new enum in this class 
  - Create setters and getters for the ElevatorSubsystem state.
  - Finally create an `ElevatorCommand.java`class
    - In this class, implement the "controller inputs" which 
      might cause the transitions you defined in your diagram.
  - Lastly, test your code in the Robot Simulator to verify
   that everything works! 

