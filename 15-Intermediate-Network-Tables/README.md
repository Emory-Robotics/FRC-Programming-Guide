# 15 - Intermediate: Network Tables

Network tables are ways to communicate information from the Robot to other clients.
Some challenges require robots to obtain information at the start of the game from Network Tables.

[What Are Network Tables](https://docs.wpilib.org/en/stable/docs/software/networktables/networktables-intro.html)

[How We Can Get and Set Data](https://docs.wpilib.org/en/stable/docs/software/networktables/reading-array-values-published-by-networktables.html)

[LimeLight Network Tables](https://docs.limelightvision.io/en/latest/getting_started.html#networking-setup)

### Example

[Sending Data to Shuffle Board](https://docs.wpilib.org/en/stable/docs/software/dashboards/shuffleboard/layouts-with-code/sending-data.html)

### What should we show

Showing exact numbers is generally not useful for drivers. The driver is generally keeping their eyes on the field and sometimes glances down shortly.
As a result, continious data such as encoder counts, distance, etc, is typically not good metrics to show. Instead, discrete data such as on/off or
states are much better data to display. The driver is able to quickly glance at it and obtain certain information without thinking too hard about the 
range of data they just observed. This does not mean that we should never showcase continious data -- how we display it is critical to its importance.

### How should we show it

With discrete variables, typical toggles or state views (using colors, shapes, images, etc) is a great way to visualize this data.
If you must show a continious variable, showing it in graph form is sometimes more beneficial.

### How much should we show

Keep it at a minimum! Show only what is neccessary for driver function (consider seperate, debug, tabs for debugging sensor values).
