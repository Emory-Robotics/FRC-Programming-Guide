# 09 - Intermediate: Controls Engineering

## Introduction to Controls

## What is PID

[![What is PID](https://www.youtube.com/watch?v=wkfEZmsQqiA)](https://img.youtube.com/vi/wkfEZmsQqiA/default.jpg)

[Read more about how to use PID in WPILib](https://docs.wpilib.org/en/stable/docs/software/advanced-controls/controllers/pidcontroller.html)

You should be able to answer:

- why we need PID
- where we can see PID
- what is the P term
- what is the I term and when it can be bad
- what is the D term and when it can be bad

### Tuning

[![Tuning PID](https://www.youtube.com/watch?v=uXnDwojRb1g)](https://img.youtube.com/vi/uXnDwojRb1g/default.jpg)

### Why To Stray Away From I & How to Fix It

[![Expanding Beyond a Simple Integral](https://www.youtube.com/watch?v=NVLXCwc8HzM)](https://img.youtube.com/vi/NVLXCwc8HzM/default.jpg)

### How to Deal with Noise and the D Term

[![Expanding Beyond a Simple Derivative](https://www.youtube.com/watch?v=7dUVdrs1e18)](https://img.youtube.com/vi/7dUVdrs1e18/default.jpg)

## How We Can Tune PID Gains Without a Robot

Similar to the tuning video above, we can model the system and plot values to tune gains without a robot.

This means that we can also introduce unit tests to verify behavior and controls. For this lesson though, focus more on the PID tuning. Test driven development is a section we'll cover later on in this guide.

[![modelling the system](https://youtu.be/RLrZzSpHP4E)](https://img.youtube.com/vi/RLrZzSpHP4E/default.jpg)

[![testing the system](https://youtu.be/uGtT8ojgSzg)](https://img.youtube.com/vi/uGtT8ojgSzg/default.jpg)
