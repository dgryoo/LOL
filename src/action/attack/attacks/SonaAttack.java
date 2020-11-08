package action.attack.attacks;

import action.attack.Attack;
import basicClass.Thing;

public class SonaAttack extends Attack {

    @Override
    public void attack(int power, Thing thing) {
        super.attack(power, thing);
        System.out.println("Sona Attack!!");

    }
}
