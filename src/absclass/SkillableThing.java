package absclass;

import inter.Skill;
import inter.Skillable;

public abstract class SkillableThing extends Thing implements Skillable {

    Skill skill;

    public SkillableThing(String tName, int health, TeamEnum team, int armor, int magicArmor, int x, int y) {
        super(tName, health, team, armor, magicArmor, x, y);
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
        System.out.println(gettName() + "이 " + skill.getSkillName() + "스킬을 사용했다.");
    }
}
