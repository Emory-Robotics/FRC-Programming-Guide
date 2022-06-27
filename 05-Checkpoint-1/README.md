# 05 - Checkpoint: 1

## Recap

So far we've learned about VSCode, GitHub, Java, and OOP.
In this checkpoint, you will put these skills to practice.

In this checkpoint, you will be implementing a simulation of pong!

## Task

- Create a class `Shape.java`
    - `float x` - the x position of the shape
    - `float y` - the y position of the shape

    - `float width` - the width of the shape
    - `float height` - the height of the shape

    - `float xSpeed` - the x velocity of the shape
    - `float ySpeed` - the y velocity of the shape

    - `public void update()` - updates the position of the shape using Euler's Method. This method should also consider any collisions

- Create a class called `Paddle.java`
    - `public Paddle(Ball ball)` - constructor should take a reference to the game ball
    - `public void update()` - overrides the `Shape class`. Constrain movement to only vertical movement

- Create a class called `Ball.java`
    - `public Ball(int fieldWidth, int fieldHeight)`

    - `public void update()` - overrides the `Shape class`. Move the ball across the field, and consider collisions with the width and height of the field.

    - `public void xCollide()` - should invert xSpeed
    - `public void yCollide()` - should invert ySpeed


- Create a class called `Game.java`
    - `float windowWidth`
    - `float windowHeight`

    - `float scoreX`
    - `float scoreY`

    - `float windowWidth`
    - `float windowHeight`

    - `Ball ball`
    - `Paddle leftPaddle`
    - `Paddle rightPaddle`

    - `public void start()` - should instantiate all game objects
    - `public void run()` - should call ball & paddle updates