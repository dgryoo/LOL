package AbsClass;

import Inter.Movable;

public abstract class AMThing extends AThing implements Movable {

    public AMThing(String tName, int health, Team team, int armor, int magicArmor, int power, int attackRange, int x, int y) {
        super(tName, health, team, armor, magicArmor, power, attackRange, x, y);
    }

    @Override
    public void move(int direction) {

    }
}
