package absclass;

import inter.Movable;
import inter.Skill;
import inter.SkillAttackedable;

public abstract class AttackableMovableThing extends AttackableThing implements Movable, SkillAttackedable {

    public AttackableMovableThing(String tName, int health, TeamEnum team, int armor, int magicArmor, int power, int attackRange, int x, int y) {
        super(tName, health, team, armor, magicArmor, power, attackRange, x, y);
    }

    @Override
    public void move(int direction) {

    }

    @Override
    public void skillAttacked(int power) {
        setHealth(getHealth() - power);
        System.out.println(gettName()+"이 스킬을맞았다");
    }
}
