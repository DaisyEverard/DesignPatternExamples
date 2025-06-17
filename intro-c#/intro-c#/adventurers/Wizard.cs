
public class Wizard : Adventurer {
    public Wizard() {
        sayCatchphrase = new SayWizardCatchphrase();
        attack = new MagicAttack();
    }
    
}
