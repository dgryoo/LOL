package absclass;

import inter.*;

public abstract class AttackableThing extends Thing implements Attackable {
    int power;
    int attackRange;


    public AttackableThing(String tName, int health, Team team, int armor, int magicArmor, int power, int attackRange, int x, int y) {
        super(tName, health, team, armor, magicArmor, x, y);
        this.power = power;
        this.attackRange = attackRange;
    }

    @Override
    public void attack(Thing thing) {

        if (getTeam() == thing.getTeam()) {
            System.out.println("같은팀을 공격할 수 없습니다.");
        } else {
            System.out.println("power : " + this.power);
            System.out.println(getTeam() + "팀의 " + gettName() + "이(가) " + this.power + "의 공격력으로 " + thing.getTeam() + "팀의 " + thing.gettName() + "을 공격했습니다.");
            thing.attacked(this.power);
            // x, y좌표와, attackRange로 공격할 수 있는지 없는지 구현

        }

    }

    @Override
    public boolean isAttack(Thing thing) {
        if (Math.sqrt(Math.pow(this.getX() - thing.getX(), 2) + Math.pow(this.getY() - thing.getY(), 2)) <= attackRange) {
            return true;
        } else {
            return false;
        }
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getAttackRange() {
        return attackRange;
    }

    public void setAttackRange(int attackRange) {
        this.attackRange = attackRange;
    }
}