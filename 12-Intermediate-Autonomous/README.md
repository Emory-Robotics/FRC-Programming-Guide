# 12 - Intermediate: Autonomous

## Redefine Autonomous Period

### What is Autonomous

[![video thumbnail](https://img.youtube.com/vi/ypxPOY4vmTw/default.jpg)](https://www.youtube.com/watch?v=ypxPOY4vmTw)

You should be able to answer:

- What Should We Do in Autonomous
- Why Do We Care About Autonomous

## Intro: How to Do Autonomous

### Time Based

[![video thumbnail](https://img.youtube.com/vi/ypxPOY4vmTw/default.jpg)](https://www.youtube.com/watch?v=ypxPOY4vmTw?t=85)

### Simple Actions

Similar to the above video, we can enable simple actions during autonomous such as firing pistons,
turning on a motor, etc without any time control.

## Why `Intro` is Bad

Now take some time to reflect: Why might doing a simple actioned
autonomous or a time based autonomous be limiting and in some cases bad/dangerous?

### Time Based vs Open Loop Based

<details>
  <summary>`Intro` is bad because...</summary>

  What if your robot is misaligned? Or another robot/item runs into yours?

  Or what if your robot wheels slip, the field is misconfigured, the tempature of the carpet is warm and more grippy,
  or your battery is under/fully charged?

  The point is, there is a LOT of things that can impact how your robot will perform in a closed loop fashion.
</details>

Close Loop: A very digital approach -- it's either on or off. It does not use any sensors to make decisions
as to when it should turn on or off.

Open Loop: A more involved approach -- using inputs/sensors, make decisions about what it's state/output should be.
For example, given the current temperature, should we turn on or off the AC?

## Intermediate: How to Do Autonomous

### Using sensors

We can use sensors to implement the following:

[![video thumbnail](https://img.youtube.com/vi/g-dgdWVO5u8/default.jpg)](https://www.youtube.com/watch?v=g-dgdWVO5u8)

However, there is an issue with this. We cannot always guarantee that we will make it to the specified target.
It is possible that our robot carries inertia and doesn't completely stop or our battery isn't fully charged
so it takes a while for us to hit the target. 

To battle this, we can use what we learned in section [09-Intermediate-Controls](09-Intermediate-Controls/)
and use a PID Controller to help facillatate fault-tolerate behavior which will achieve much more accurate results.

[![video thumbnail](https://img.youtube.com/vi/jIKBWO7ps0w/default.jpg)](https://www.youtube.com/watch?v=jIKBWO7ps0w)

[![video thumbnail](https://img.youtube.com/vi/Z24fSBVJeGs/default.jpg)](https://www.youtube.com/watch?v=Z24fSBVJeGs)

### Chaining Commands TLDR

You may have noticed that in order to accomplish different tasks,
you need to put all the command logic in one command. This can make it difficult
to make sequential commands where you want to perform actions one after the other;
or maybe you want to perform actions in parrallel such as shooting while driving or
indexing while intaking.

To accomplish this, we will use Command Groups. This is a topic that will be discussed
in a further section.
