package adventurers;
import catchphrase.SayCatchphraseBehaviour;
import attack.AttackBehaviour;

public abstract class Adventurer {
    public SayCatchphraseBehaviour sayCatchphrase;
    public AttackBehaviour attack;
    public void scream() {
        System.out.println("AAAAAAA!");
    };
}
