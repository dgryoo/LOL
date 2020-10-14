package absclass;

import inter.Skill;
import inter.SkillAttackedable;
import inter.Skillable;

public abstract class AttackableRevivableMovableSkillableThing extends AttackableRevivableMovableThing implements Skillable, SkillAttackedable {

    private Skill skill;

    public AttackableRevivableMovableSkillableThing(String tName, int health, Team team, int armor, int magicArmor, int power, int attackRange, int x, int y) {
        super(tName, health, team, armor, magicArmor, power, attackRange, x, y);
    }

    @Override
    public int skillActivate(Skill skill) {
        System.out.println("skill power : " + skill.getSkillPower()+ "#################");
        return skill.getSkillPower();
    }

    @Override
    public void skillAttacked(int power) {
        setHealth(getHealth()-power);

        if (getHealth() <= 0) {
            System.out.println(power + "의 스킬피해를 받음#######");
            dead();
        } else {
            System.out.println(power + "의 스킬피해를 받음#######");
            System.out.println(gettName() + "의 체력이" + getHealth() + " 남았습니다##############");
        }
    }

    public Skill getSkill() {
        return skill;
    }

    public void setSkill(Skill skill) {
        this.skill = skill;
    }
}