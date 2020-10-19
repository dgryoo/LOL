package absclass;

import inter.Skill;
import inter.Skillable;

public abstract class SkillableThing extends Thing implements Skillable {

    public SkillableThing(String tName, int health, TeamEnum team, int armor, int magicArmor, int x, int y) {
        super(tName, health, team, armor, magicArmor, x, y);
    }


    @Override
    public int skillActivate(Skill skill) {
        return 0;
    }
}
