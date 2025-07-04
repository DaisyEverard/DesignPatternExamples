package attack;

public class MagicAttack implements IAttackBehaviour {
    private int damage = 4;
    private int loadTime = 5;

    public void attackBehaviour() {
        System.out.println("Starting async magic attack...");
        
        Thread newThread = new Thread(() -> {
            try {
                    Thread.sleep(1000 * loadTime);
                    System.out.println(String.format("%s Magic damage dealt!", damage));
                } catch (InterruptedException e) {
                    System.out.println("Attack was interrupted!");
                }
        });

        newThread.start();
    }
}
