package kg.geektech.game.players;

public class Alukard extends Hero {
    private int vAmpirism;

    public Alukard(int health, int damage) {
        super(health, damage, SuperAbility.VAMPIRISM);
    }

    public Alukard(int health, int damage, int vAmpirism) {
        super(health, damage, SuperAbility.VAMPIRISM);
        this.vAmpirism = vAmpirism;
    }

    public int getvAmpirism() {
        return vAmpirism;
    }

    public void setvAmpirism(int vAmpirism) {
        this.vAmpirism = vAmpirism;
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {

        if (this.getHealth() > 0) { //Вампиризм — это способность превращающая
            // часть нанесенного урона в здоровье при атаке на вражеских юнитов//Тоесть отрывает  HP орубленный героем и прибовляет его к себе в здоровье
            for (int i = 0; i < heroes.length; i++) {
                if (heroes[i].getHealth() > 0 && this != heroes[i]) {
                    heroes[5].setHealth(heroes[5].getHealth() + this.vAmpirism);
                }
            }
        }

    }
}
