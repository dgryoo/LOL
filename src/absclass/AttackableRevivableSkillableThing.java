package absclass;

import inter.Skill;
import inter.Skillable;

public abstract class AttackableRevivableSkillableThing extends AttackableRevivableThing implements Skillable {

    public AttackableRevivableSkillableThing(String tName, int health, TeamEnum team, int armor, int magicArmor, int power, int attackRange, int x, int y) {
        super(tName, health, team, armor, magicArmor, power, attackRange, x, y);
    }

    @Override
    public int skillActivate(Skill skill) {
        System.out.println("skill power : " + skill.getSkillPower()+ "#################");
        return skill.getSkillPower();
    }


}
