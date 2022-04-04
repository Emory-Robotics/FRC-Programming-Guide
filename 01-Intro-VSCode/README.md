# 01 - Intro: Visual Studio Code

## What is the Command Palette

The command palette is where you can practically do anything in Visual Studio Code.
It will handle all commands you can think from staging files on git to changing
the font size. You will use the command palette a majority of the time to create
robot projects, build robot code, and deploy robot code. To open the command palette:

* Windows & Linux: `CTRL-SHIFT-P`
* Mac: `CMD-SHIFT-P`

When you open the command palette you will notice that there is a `>` at the
start before you type anything. This indicates to VSCode that what you are about
to type is a command. If you accidentally delete it and then try to run a command,
it will not work.

## Create Robot Project

Open th command palette an type `WPILib: Create a new project`.
This will cause a window to pop up that will allow you to enter the configurations
for the project. Start by selecting `Template -> Java -> Command Robot`. Select a
folder to save the project in. The project name should be something that describes
the code with a season year ie. `Haunted_House_2019` or `FRC_2019`.

## Building Robot Project

Open the Command Palette and type `WPILib: Build Robot Code` to build the robot
code. You do not have to be connected to the robot to build the code. This will
generally expose any compile time errors that your code may have. Try to build
every now and then to ensure the code you are working on isn't going to break
at compile time.

## Deploying the Robot Code

Open the Command Palette and type `WPILib: Deploy Robot Code` to deploy robot code.
You must be connected to the Robot's RIO in order to deploy code. Deploying code
will put the robot in a state where it cannot be enabled.

## Explorer

The explorer is the icon on the left that looks like files. When having the
explorer active, you will be able to see the current folder's contents. The
"Open Editors" tab contains all of the current opened files in the window.
Then theres the tab named after the folder, which contains all of the folder's
contents. You can right click in this section to create a new file, folder,
delete items, etc. When working with Robot Code you will be able to right
click and create new Subsystems, Commands, and even empty classes.

## Creating Files

To start programming you want to use the pre-made templates provided by the
WPI Library extension. To do so, right click on the folder you would like
to create the file in, select the last option `create a new class/command`
and the select the appropriate class you would like to use. This will provide
you with a boiler template with all of the necessary methods and functionality
you will need.

## Source Control

This is the icon that looks like a "Y". In the Source Control you will be able
to see any modifications that git is currently tracking as well as the current
status of your repository.

## Extensions

This is the icon that looks like a square. You will be able to explore the market
place for extensions, color themes, and file icon themes.
