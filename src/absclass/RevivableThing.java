package absclass;

import inter.Revivable;
import manager.RevivableManager;

public abstract class RevivableThing extends Thing implements Revivable {

    public RevivableThing(String tName, int health, TeamEnum team, int armor, int magicArmor) {
        super(tName, health, team, armor, magicArmor);
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
