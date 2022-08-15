# 13 - Intermediate: Path Following

## Generating Paths

### Path Planner vs Path Weaver

#### Path Weaver

[![Pathweaver tutorial](https://img.youtube.com/vi/-7YRuiD8Zlk/default.jpg)](https://www.youtube.com/watch?v=-7YRuiD8Zlk)

#### Path Planner

https://github.com/mjansen4857/pathplanner

It is the general  consensus that Path Weaver is preferred given that it is nicely integrated
with WPILib.

### What are good paths?

A good path is not always a straight line from point A to point B. There
are a lot of things to consider when designing a path!

For example: 

[![Bad path](https://img.youtube.com/vi/fT7VLFkdj_o/default.jpg)](https://www.youtube.com/watch?v=fT7VLFkdj_o)

It is critical to consider other robots on the field, field elements,
as well as the overall spline your robot will be following. Sharp, jagged
turns can cause the robot to tip over, become unstable, or inaccurate.

Smooth splines and paths are typically more consistent, safer, and accurate.

## How to Use Paths:

### Implementing Path Following using a Ramsete Controller

[![Ramsete Controller Tutorial](https://img.youtube.com/vi/wqJ4tY0u6IQ/default.jpg)](https://www.youtube.com/watch?v=wqJ4tY0u6IQ)

Note, that to use the Ramsete Controller, you may need to characterize your drive  train. This process will help you tune
your superstructure for smooth path following.
