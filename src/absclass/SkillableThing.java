package absclass;

import inter.Skill;
import inter.Skillable;

public abstract class SkillableThing extends Thing implements Skillable {

    Skill skill;

    public SkillableThing(String tName, int health, TeamEnum team, int armor, int magicArmor) {
        super(tName, health, team, armor, magicArmor);
    }


    public Skill getSkill() {
        return skill;
    }

    public void setSkill(Skill skill) {
        this.skill = skill;
        System.out.println(gettName() + "이 " + skill.getSkillName() + "스킬을 사용했다.");
    }

    @Override
    public Skill skillActivate() {
        return skill;
    }
}
