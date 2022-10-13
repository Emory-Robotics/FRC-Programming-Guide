# 14 - Intermediate: Combining Commands

[Command Groups](https://docs.wpilib.org/en/stable/docs/software/commandbased/command-groups.html)

## Benefits of combining commands

Combining commands allows us to create more coordinated actions to accomplish complex robot actions.
For example, how can we aim and shoot at the same time? Or, how can we extend and run the intake at the same time?
Or, how can we run the indexer after the intake has retracted? Combining commands allows us to introduce complexity, or
"smart" commands.

### Parallelizing Commands

Parallelizing is one way to create "smart" commands. This allows us to run two commands at the same time.

### Sequential Commands

Sequential commands allow us to run commands one after another and allow us to introduce order to actions.

### Interrupting Commands

If we need to abort, there are resources which allow us to terminate command groups when needed.

### Generalizing Commands

By providing arguments to commands, we can keep them general allowing for complex behavior to be defined.

Such as a class that can drive a shooter motor to a specific speed can be reused in a command group that can
aim and shoot from any distance.

### Chaining Commands

We can use a combination of sequential commands and parallel commands to chain commands together.
