package variable_scope;

import java.util.Random;

public class DiceRoller {
    Random random;
    int broj = 0;
    DiceRoller() {
        random = new Random();
        roll(random, broj);
    }

    void roll(Random random, int broj) {
        broj = random.nextInt(6) + 1;
        System.out.println(broj);
    }
}
