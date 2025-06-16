package attack;

public class SwordAttack implements AttackBehaviour {
    private int damage = 2;
    private int loadTime = 2;

    public void attackBehaviour() {
        try {
            Thread.sleep(10 * loadTime);
        } catch (InterruptedException e) {
            System.out.println("Attack was interrupted!");
        }
        System.out.println(String.format("%s slashing damage dealt!", damage));
    }
}
