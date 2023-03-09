package src.main.java.com.michaelrichardhall.codewars;

//Two fighters, one winner.
//Create a function that returns the name of the winner in a fight between two fighters.
//
//        Each fighter takes turns attacking the other and whoever kills the other first is victorious. Death is defined as having health <= 0.
//
//        Each fighter will be a Fighter object/instance. See the Fighter class below in your chosen language.
//
//        Both health and damagePerAttack (damage_per_attack for python) will be integers larger than 0. You can mutate the Fighter objects.
//
//        Your function also receives a third argument, a string, with the name of the fighter that attacks first.
//
//        Example:
//        declare_winner(Fighter("Lew", 10, 2), Fighter("Harry", 5, 4), "Lew") => "Lew"
//
//        Lew attacks Harry; Harry now has 3 health.
//        Harry attacks Lew; Lew now has 6 health.
//        Lew attacks Harry; Harry now has 1 health.
//        Harry attacks Lew; Lew now has 2 health.
//        Lew attacks Harry: Harry now has -1 health and is dead. Lew wins.
//
//public class Fighter {
//    public String name;
//    public int health, damagePerAttack;
//    public Fighter(String name, int health, int damagePerAttack) {
//        this.name = name;
//        this.health = health;
//        this.damagePerAttack = damagePerAttack;
//    }
//}

public class TwoFightersOneWinner {
    public class Fighter {
        public String name;
        public int health, damagePerAttack;
        public Fighter(String name, int health, int damagePerAttack) {
            this.name = name;
            this.health = health;
            this.damagePerAttack = damagePerAttack;
        }
    }

    public static String declareWinner(Fighter fighter1, Fighter fighter2, String firstAttacker) {
        Fighter firstFighter = null;
        Fighter secondFighter = null;
        if (fighter1.name.equals(firstAttacker)) {
            firstFighter = fighter1;
            secondFighter = fighter2;
        } else {
            firstFighter = fighter2;
            secondFighter = fighter1;
        }

        while (firstFighter.health > 0 && secondFighter.health > 0) {
            secondFighter.health -= firstFighter.damagePerAttack;
            if (secondFighter.health > 0) {
                firstFighter.health -= secondFighter.damagePerAttack;
            }
        }
        return firstFighter.health <= 0 ? secondFighter.name : firstFighter.name;
    }
}
