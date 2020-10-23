package absclass;

import inter.Skill;
import inter.SkillAttackedable;
import inter.Skillable;

public abstract class AttackableRevivableSkillableThing extends AttackableRevivableThing implements Skillable, SkillAttackedable {
    Skill skill;

    public AttackableRevivableSkillableThing(String tName, int health, TeamEnum team, int armor, int magicArmor, int power, int attackRange, int x, int y) {
        super(tName, health, team, armor, magicArmor, power, attackRange, x, y);
    }

//    @Override
//    public Skill skillActivate(Skill skill) {
//        System.out.println("skill power : " + skill.getSkillPower()+ "#################");
//        return skill.getSkillPower();
//    }

    public Skill getSkill() {
        return skill;
    }

    public void setSkill(Skill skill) {
        this.skill = skill;
    }
}
