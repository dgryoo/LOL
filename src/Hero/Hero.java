package Hero;

import AbsClass.AttackableThing;
import AbsClass.Team;
import Inter.Movable;
import Inter.Revivable;

public abstract class Hero extends AttackableThing implements Movable, Revivable {

    private int level;
    private int experience;


    public Hero(String tName, int health, Team team, int armor, int magicArmor, int x, int y, int power, int attackRange) {
        super(tName, health, team, armor, magicArmor, x, y, power, attackRange);
        this.level = 1;
        this.experience = 0;
    }

    abstract public void skill();

    abstract public void ultimateSkill();

    @Override
    public void status() {

        super.status();
        System.out.println("level : " + level);
        System.out.println("experience : " + experience);

    }

    @Override
    public void move(int direction) {
        System.out.println("움직일 방향을 선택하세요");
        switch (direction) {
            case 1:
                this.setX(this.getX() - 1);
                this.setX(this.getY() - 1);
                break;
            case 2:
                this.setY(this.getY() - 1);
                break;
            case 3:
                this.setX(this.getX() + 1);
                this.setY(this.getY() - 1);
                break;
            case 4:
                this.setX(this.getX() - 1);
                break;
            case 6:
                this.setX(this.getX() + 1);
                break;
            case 7:
                this.setX(this.getX() - 1);
                this.setY(this.getY() + 1);
                break;
            case 8:
                this.setX(this.getY() + 1);
                break;
            case 9:
                this.setX(this.getX() + 1);
                this.setY(this.getY() + 1);
                break;

        }


    }

    @Override
    public void revive() {

    }

}


