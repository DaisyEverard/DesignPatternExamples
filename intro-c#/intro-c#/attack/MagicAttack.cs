
public class MagicAttack : IAttackBehaviour {
    private int damage = 4;
    private int loadTime = 5;

    public void AttackBehaviour() {

        Thread.Sleep(1000 * loadTime);
        Console.WriteLine($"{damage} Magic damage dealt!");
    }
}
