package adventurers;
import catchphrase.ICatchphraseBehaviour;
import attack.IAttackBehaviour;

public abstract class Adventurer {
    public ICatchphraseBehaviour sayCatchphrase;
    public IAttackBehaviour attack;

    public void setCatchphraseBehaviour (ICatchphraseBehaviour cb) {
        sayCatchphrase = cb;
    }
    public void setAttackBehaviour (IAttackBehaviour ab) {
        attack = ab;
    }
    public void scream() {
        System.out.println("AAAAAAA!");
    };
}
