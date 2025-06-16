package attack;

public class MagicAttack implements AttackBehaviour {
    private int damage = 4;
    private int loadTime = 5;

    public void attackBehaviour() {
        try {
            Thread.sleep(10 * loadTime);
        } catch (InterruptedException e) {
            System.out.println("Attack was interrupted!");
        }
        System.out.println(String.format("%s Magic damage dealt!", damage));
    }
}
