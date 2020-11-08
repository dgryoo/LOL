package action.skill;

import action.skilled.Skilledable;
import basicClass.Thing;

public class SkillAttack {

    public void skillAttack(int power, Skilledable skilledable) {
        skilledable.skilled(power);
    }

}
