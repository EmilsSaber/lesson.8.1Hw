package kg.geektech.game.players;

import java.util.Random;

public class Magic extends Hero {
private int BoostHit;

    public Magic(int health, int damage) {
        super(health, damage, SuperAbility.BOOST);

    }

    public Magic(int health, int damage,  int boostHit) {
        super(health, damage,SuperAbility.BOOST);
        BoostHit = boostHit;

    }

    public int getBoostHit() {
        return BoostHit;
    }

    public void setBoostHit(int boostHit) {
        BoostHit = boostHit;
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {

        if (this.getHealth() > 0) {
            for (int i = 0; i < heroes.length; i++) {
                if (heroes[i].getHealth() > 0 && this != heroes[i]) {
                    heroes[i].setDamage(heroes[i].getDamage() + this.BoostHit);
                }
            }
        }



    }
}
