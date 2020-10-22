package absclass;

import inter.Skill;
import inter.SkillAttackedable;
import inter.Skillable;

public abstract class AttackableRevivableMovableSkillableThing extends AttackableRevivableMovableThing implements Skillable, SkillAttackedable {

    private Skill skill;

    public AttackableRevivableMovableSkillableThing(String tName, int health, TeamEnum team, int armor, int magicArmor, int power, int attackRange, int x, int y) {
        super(tName, health, team, armor, magicArmor, power, attackRange, x, y);
    }

    @Override
    public Skill skillAttack() {
        return skill;
    }

    public Skill getSkill() {
        return skill;
    }

    public void setSkill(Skill skill) {
        this.skill = skill;
    }
}