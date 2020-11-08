package action.attack.attacks;

import action.attack.Attack;
import basicClass.Thing;

public class SuperPowerAttack extends Attack {

    @Override
    public void attack(int power, Thing thing) {
        super.attack(power, thing);
        System.out.println("SuperPower Attack!!");
    }
}
