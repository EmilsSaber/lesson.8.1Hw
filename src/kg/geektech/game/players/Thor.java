package kg.geektech.game.players;

import kg.geektech.game.general.RPG_Game;

import java.util.Random;

public class Thor extends Hero {
    private int oGlush;

    public Thor(int health, int damage) {
        super(health, damage, SuperAbility.OGLUSH);
    }


    public Thor(int health, int damage, int oGlush) {
        super(health, damage, SuperAbility.OGLUSH);
        this.oGlush = oGlush;
    }

    public int getoGlush() {
        return oGlush;
    }

    public void setoGlush(int oGlush) {
        this.oGlush = oGlush;
    }


    public void hit(Boss boss) {

        Random random = new Random();
        boolean thors = random.nextBoolean();


        if (this.getHealth() > 0 && boss.getHealth() > 0 && thors == true) {
            boss.setDamage(0);
        } else {
            boss.setHealth(boss.getHealth()
                    - this.getDamage());
        }
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {

///



    }
}
