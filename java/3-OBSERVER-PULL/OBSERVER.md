## Info

In the previous part of this example the Subject pushed infomation to the Observers when it was updated

In this example the observers will pull data when they need it
This allows them to get different parts of the state to each other and only get sent information when it's required for them to update.

This only required small changes to the notify and update methods

```
The Observer Pattern defines a one-to-many dependency between objects so that when one object changes state,
 all of its dependents are notified and updated automatically.
```
![alt text](../../assets/observer.png)

## Why?
The observer and subject are loosely coupled meaning
- subject only knows about the IObserver, not which concrete observer it's using
- Observers can be added or removed at any time without editing the subject
- Subject and Objects can be re-used and modified independently of each other
