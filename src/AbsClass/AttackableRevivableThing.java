package AbsClass;

import Inter.Revivable;

public abstract class AttackableRevivableThing extends AttackableThing implements Revivable {

    public AttackableRevivableThing(String tName, int health, Team team, int armor, int magicArmor, int power, int attackRange, int x, int y) {
        super(tName, health, team, armor, magicArmor, power, attackRange, x, y);
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
