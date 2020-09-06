package AbsClass;

import Inter.Revivable;

public abstract class ARThing extends AThing implements Revivable {

    public ARThing(String tName, int health, Team team, int armor, int magicArmor, int x, int y, int power, int attackRange) {
        super(tName, health, team, armor, magicArmor, x, y, power, attackRange);
    }

    @Override
    public void dead() {
        super.dead();
        revive();
    }

    @Override
    public void revive() {
        System.out.println(gettName() + "가 " + "5턴뒤에 부활합니다");
    }

}
