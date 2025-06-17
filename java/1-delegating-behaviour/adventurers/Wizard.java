package adventurers;

import catchphrase.SayWizardCatchphrase;
import attack.MagicAttack;

public class Wizard extends Adventurer {
    public Wizard() {
        sayCatchphrase = new SayWizardCatchphrase();
        attack = new MagicAttack();
    }

    public void sayCatchphrase () {
        sayCatchphrase.sayCatchphrase();
    }

    public void attack() {
        attack.attackBehaviour();
    }
     
}
