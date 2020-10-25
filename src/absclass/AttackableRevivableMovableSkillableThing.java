package absclass;

import inter.Skill;
import inter.SkillAttackedable;
import inter.Skillable;

public abstract class AttackableRevivableMovableSkillableThing extends AttackableRevivableMovableThing implements Skillable, SkillAttackedable {

    private Skill skill;

    public AttackableRevivableMovableSkillableThing(String tName, int health, TeamEnum team, int armor, int magicArmor, int power, int attackRange) {
        super(tName, health, team, armor, magicArmor, power, attackRange);
    }

    @Override
    public Skill skillActivate() {
        return skill;
    }

    @Override
    public void skillAttacked(int power, String damageType) {
        super.skillAttacked(power, damageType);
    }

    public void setSkill(Skill skill) {
        this.skill = skill;
    }
}