
import adventurers.Wizard;
import adventurers.Swordsman;

class Program
{
    static void Main(string[] args)
    {
        Wizard balthazarTheGreat = new Wizard();
        Swordsman jeff = new Swordsman();

        balthazarTheGreat.sayCatchphrase();
        jeff.sayCatchphrase();

        jeff.attack();
        balthazarTheGreat.attack();
    }
}