package AbsClass;

import Inter.Movable;

public abstract class AMThing extends AThing implements Movable {

    public AMThing(String tName, int health, Team team, int armor, int magicArmor, int x, int y, int power, int attackRange) {
        super(tName, health, team, armor, magicArmor, x, y, power, attackRange);
    }

    @Override
    public void move(int direction) {

    }
}
