# Code Lab: 12 - Intermediate: Autonomous

## Description

In this codelab, we are going to practice writing an autonomous command.

To keep this simple, let's do this for a shooter superstructure. 
Assume your superstructure looks like the following:

![Ball Shooter](https://www.chiefdelphi.com/t/design-shooter/388925)

It has 2 falcon motors. For simplicity, let's pretend like we don't have a hood, turret, or limelight.
We have only the 2 falcon motors. Note: Falcon motors come with integrated motor encoders.

### Tasks

- Create a new robot project with simulator support
- Create and implement ShooterSubsystem.java
- Create the following 3 commands:
  - TimedShotCommand.java: turns the shooter motor on to max voltage for a specified amount of seconds and then turns it off
  - VoltageShotCommand.java: turns the shooter motor on to a specified voltage and turns it off when the command is ended/inturrupted
  - RPMShotCommand.java: controls the shooter motor to a specified RPM and maintains it using PID. Turns off when command is ended/inturrupted
    - Note: You can assume the gearing is 1:1, meaning motor encoder value = current RPM
- Using the robot simulator, test each command and observe the motor behavior.
  - Take a screenshot of the voltage graph for the motor voltage for each command
  - Save the screenshots to this folder
- Push your changes to your GitHub
