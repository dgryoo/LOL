package action.attack.attacks;

import action.attack.Attack;
import basicClass.Thing;

public class DragonAttack extends Attack {

    @Override
    public void attack(int power, Thing thing) {
        super.attack(power, thing);
        System.out.println("Dragon Attack!!");
    }
}
