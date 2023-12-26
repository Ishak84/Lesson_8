package players;

import kg.geeks.game.SuperAbility;

import java.util.Random;

public class Thor extends Hero {
    public Thor(int health, int damage, String name) {
        super(health, damage, SuperAbility.STUN, name);
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        Random random = new Random();
        boolean thorHamer = random.nextBoolean();
        if (thorHamer) {
            boss.setDamage(0);
            System.out.println("Boss is stun");
        } else {
            boss.setDamage(50);
        }
    }
}
