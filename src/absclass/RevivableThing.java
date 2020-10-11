package absclass;

import inter.Revivable;
import manager.RevivableManager;

public abstract class RevivableThing extends Thing implements Revivable {

    public RevivableThing(String tName, int health, Team team, int armor, int magicArmor, int x, int y) {
        super(tName, health, team, armor, magicArmor, x, y);
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
