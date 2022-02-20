package kg.geektech.game.players;

public class Witcher extends Hero{
    private int save;


    public Witcher(int health, int damage ) {
        super(health, damage, SuperAbility.With);
    }


    public int getSave() {
        return save;
    }

    public void setSave(int save) {
        this.save = save;
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        if (this.getHealth() > 0) {
            for (int i = 0; i < heroes.length; i++) {
                if (heroes[i].getHealth() == 0 && this != heroes[i]) {
                    heroes[i].setHealth(heroes[i].getHealth() + this.getHealth());
                    break;
                }

            }
        }
    }


    }

