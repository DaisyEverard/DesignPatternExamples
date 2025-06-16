package attack;

public class MagicAttack implements AttackBehaviour {
    private int damage = 4;
    private int loadTime = 5;

    public void attackBehaviour() {
        Thread newThread = new Thread(() -> {
            try {
                    Thread.sleep(10 * loadTime);
                    System.out.println(String.format("%s Magic damage dealt!", damage));
                } catch (InterruptedException e) {
                    System.out.println("Attack was interrupted!");
                }
        });

        newThread.start();
    }
}
