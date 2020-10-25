package absclass;

import inter.Movable;
import inter.SkillAttackedable;

public abstract class AttackableRevivableMovableThing extends AttackableRevivableThing implements Movable, SkillAttackedable {

    public AttackableRevivableMovableThing(String tName, int health, TeamEnum team, int armor, int magicArmor, int power, int attackRange) {
        super(tName, health, team, armor, magicArmor, power, attackRange);
    }

    @Override
    public void skillAttacked(int power, String damageType) {
        if (damageType == "p") {
            setHealth(getHealth() + getArmor() - power);
            System.out.println(gettName() + "가 물리스킬공격받음");
        } else {
            setHealth(getHealth() + getMagicArmor() - power);
            System.out.println(gettName() + "가 마법스킬공격받음");
        }

        if (getHealth() > 0) {
            System.out.println(gettName() + "의 체력은 " + getHealth() + " 남았습니다");
        } else {
            dead();
        }

    }

    @Override
    public void move(int direction) {

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
}
