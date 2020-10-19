package absclass;

import inter.Revivable;
import manager.RevivableManager;

public abstract class AttackableRevivableThing extends AttackableThing implements Revivable {

    public AttackableRevivableThing(String tName, int health, TeamEnum team, int armor, int magicArmor, int power, int attackRange, int x, int y) {
        super(tName, health, team, armor, magicArmor, power, attackRange, x, y);
    }

    @Override
    public void dead() {
        super.dead();
        RevivableManager.getInstance().addDeadRevivable(this);
    }

    @Override
    public void revive() {
        alive();
    }

}
