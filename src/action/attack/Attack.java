package action.attack;

import basicClass.Thing;

public abstract class Attack {

    public void attack(int power, Thing thing) {
        thing.attacked(power);
    }

}
