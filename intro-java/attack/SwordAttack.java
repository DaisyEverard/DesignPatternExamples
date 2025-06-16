package attack;

public class SwordAttack implements AttackBehaviour {
    private int damage = 2;
    private int loadTime = 2; // in seconds

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