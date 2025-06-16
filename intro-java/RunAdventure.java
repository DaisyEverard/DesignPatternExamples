
import adventurers.Wizard;
import adventurers.Swordsman;
class RunAdventure
{
    public static void main(String[] args)
    {
        Wizard balthazarTheGreat = new Wizard();
        Swordsman jeff = new Swordsman();

        balthazarTheGreat.sayCatchphrase();
        jeff.sayCatchphrase();

        jeff.attack();
        balthazarTheGreat.attack();
        jeff.attack();
        jeff.attack();
    }
}