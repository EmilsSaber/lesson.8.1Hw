package kg.geektech.game.players;

public class Golem extends Hero {
    private int tAke_Damage;

    public Golem(int health, int damage) {
        super(health, damage, SuperAbility.TAKE_DAMAGE);
    }

    public Golem(int health, int damage, int tAke_Damage) {
        super(health, damage, SuperAbility.TAKE_DAMAGE);
        this.tAke_Damage = tAke_Damage;
    }

    public int gettAke_Damage() {
        return tAke_Damage;
    }

    public void settAke_Damage(int tAke_Damage) {
        this.tAke_Damage = tAke_Damage;
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {

//        for (int i = 0; i < heroes.length; i++) {
//        if(heroes[6].getDamage() == true){
//
//
//        }
//
//
//        }

        if (this.getHealth() > 0) {
            for (int i = 0; i < heroes.length; i++) {
                if ( boss.getDamage() == 0 && heroes[i].getHealth() > 0 && this != heroes[i]) {
                    tAke_Damage = boss.getDamage() / 1;
                    heroes[i].setHealth(heroes[i].getHealth()-this.tAke_Damage);
                }
                else {
                    tAke_Damage = boss.getDamage() / 5;
                    heroes[i].setHealth(heroes[i].getHealth()-this.tAke_Damage);

                }
            }
        }
    }

}

