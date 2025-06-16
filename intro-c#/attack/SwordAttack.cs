package attack;

public class SwordAttack : AttackBehaviour {
    private int damage = 2;
    private int loadTime = 2;

    AttackBehaviour() {
        try {
            Thread.sleep(10 * loadTime);
        } catch (InterruptedException e) {
            System.println("Attack was interrupted!");
        }
        System.println(String.format("%s slashing damage dealt!", damage));
    }
}
