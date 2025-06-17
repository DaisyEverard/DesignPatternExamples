
public class SwordAttack : IAttackBehaviour {
    private int damage = 2;
    private int loadTime = 2;

    public void AttackBehaviour() {
        Thread.Sleep(1000 * loadTime);
        Console.WriteLine($"{damage} slashing damage dealt!");
    }
}
