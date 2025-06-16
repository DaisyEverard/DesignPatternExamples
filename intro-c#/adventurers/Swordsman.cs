package adventurers;

public class Swordsman : Adventurer {

    Swordsman() {
    sayCatchphrase = new SaySwordsmanCatchphrase();
    attack = new SwordAttack();
    }
};
