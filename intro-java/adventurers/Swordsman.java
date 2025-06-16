package adventurers;

import catchphrase.SaySwordsmanCatchphrase;
import attack.SwordAttack;

public class Swordsman extends Adventurer {

    Swordsman() {
    sayCatchphrase = new SaySwordsmanCatchphrase();
    attack = new SwordAttack();
    }
};
