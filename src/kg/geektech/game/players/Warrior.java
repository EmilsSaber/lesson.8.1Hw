package kg.geektech.game.players;

import kg.geektech.game.general.RPG_Game;
public class Warrior extends Hero {
    public Warrior(int health, int damage) {
        super(health, damage, SuperAbility.CRITICAL_DAMAGE);
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        int coeff = RPG_Game.random.nextInt(2)+2;

        if (this.getHealth() > 0) {
            for (int i = 0; i < heroes.length; i++) {
                if (heroes[i].getHealth() > 0 && this != heroes[i]) {
                    heroes[0].setDamage(heroes[0].getDamage() + coeff);
                }
            }
        }
    }
}
