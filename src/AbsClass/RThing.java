package AbsClass;

import Inter.Revivable;

public abstract class RThing extends Thing implements Revivable {

    public RThing(String tName, int health, Team team, int armor, int magicArmor, int x, int y) {
        super(tName, health, team, armor, magicArmor, x, y);
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
