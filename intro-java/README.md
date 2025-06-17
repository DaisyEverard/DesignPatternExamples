## Concept

This is a way of creating different kinds of characters for an RPG style game who all inherit from the same 'Adventurer' class

Each adventurer has an attack and a catchphrase

AttackBehaviour and SayCatchphraseBehaviour are interfaces which have different types of attack and catchphrase under them which are assigned to each kind of adventurer

Each Wizard (Adventurer) is instantiated with a SayWizardCatchphrase behavour and a MagicAttack for their attack

## issues
The attacks should run asynchronously in threads but are currently blocking the main thread

## When to use
## When not to use