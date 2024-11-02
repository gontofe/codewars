package src.main.java.com.michaelrichardhall.codewars;

import static java.lang.Math.max;

/*
Create a combat function that takes the player's current health and the amount of damage received, and returns the player's new health. Health can't be less than 0.
 */

public class GrasshopperTerminalGameCombatFunction {
    public static int combat(int health, int damage) {
        return max(health - damage, 0);
    }
}
