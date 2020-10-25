package absclass;

import inter.Movable;
import inter.Skill;
import inter.SkillAttackedable;

public abstract class AttackableMovableThing extends AttackableThing implements Movable, SkillAttackedable {

    public AttackableMovableThing(String tName, int health, TeamEnum team, int armor, int magicArmor, int power, int attackRange) {
        super(tName, health, team, armor, magicArmor, power, attackRange);
    }

    @Override
    public void move(int direction) {

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
}