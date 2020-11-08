package action.skill;

public class Skill {
    String skillName;
    String damageType;
    String skillType;
    int skillRange;
    int skillPower;

    public Skill(String skillName, String damageType, String skillType, int skillRange, int skillPower) {
        this.skillName = skillName;
        this.damageType = damageType;
        this.skillType = skillType;
        this.skillRange = skillRange;
        this.skillPower = skillPower;
    }

    public String getSkillName() {
        return skillName;
    }

    public void setSkillName(String skillName) {
        this.skillName = skillName;
    }

    public String getDamageType() {
        return damageType;
    }

    public void setDamageType(String damageType) {
        this.damageType = damageType;
    }

    public String getSkillType() {
        return skillType;
    }

    public void setSkillType(String skillType) {
        this.skillType = skillType;
    }

    public int getSkillRange() {
        return skillRange;
    }

    public void setSkillRange(int skillRange) {
        this.skillRange = skillRange;
    }

    public int getSkillPower() {
        return skillPower;
    }

    public void setSkillPower(int skillPower) {
        this.skillPower = skillPower;
    }
}
