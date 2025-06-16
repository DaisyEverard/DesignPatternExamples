package attack;

public class MagicAttack : AttackBehaviour {
    private int damage = 4;
    private int loadTime = 5;

    AttackBehaviour() {
        try {
            Thread.sleep(10 * loadTime);
        } catch (InterruptedException e) {
            System.println("Attack was interrupted!");
        }
        System.println(String.format("%s Magic damage dealt!", damage));
    }
}
