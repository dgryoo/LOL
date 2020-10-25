package unit;

import absclass.Thing;
import inter.Attackable;
import inter.Skill;
import inter.Skillable;

public class Dragon implements Skillable, Attackable{
        private Skill skill;
        private Attackable attackable;

    public Dragon(Skill skill, Attackable attackable) {
        this.skill= skill;
        this.attackable = attackable;
    }

    @Override
    public void attack(Thing thing) {
        attackable.attack(thing);
    }

    @Override
    public boolean isAttack(Thing thing) {
        return attackable.isAttack(thing);
    }

    @Override
    public Skill skillActivate() {
        return skill;
    }
}
