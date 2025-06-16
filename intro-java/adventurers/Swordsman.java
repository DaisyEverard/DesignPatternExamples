package adventurers;

import catchphrase.SaySwordsmanCatchphrase;
import attack.SwordAttack;

public class Swordsman extends Adventurer {

    public Swordsman() {
    sayCatchphrase = new SaySwordsmanCatchphrase();
    attack = new SwordAttack();
    }

    public void sayCatchphrase () {
        sayCatchphrase.sayCatchphrase();
    }

    public void attack() {
        attack.attackBehaviour();
    }
};
