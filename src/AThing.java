public abstract class AThing extends Thing implements Attackable{
    int power;
    int attackRange;


    public AThing(String tName, int health, Team team, int armor, int magicArmor, int x, int y, int power, int attackRange) {
        super(tName, health, team, armor, magicArmor, x, y);
        this.power = power;
        this. attackRange = attackRange;
    }

    @Override
    public void attack(Thing thing) {
        if (getTeam() == thing.getTeam()) {
            System.out.println("같은팀을 공격할 수 없습니다.");
        } else {
            System.out.println(getTeam() + "팀의 " + gettName() + "이(가) " + power + "의 공격력으로 " + thing.getTeam() + "팀의 " + thing.gettName() + "을 공격했습니다.");
            thing.attacked(power);
            // x, y좌표와, attackRange로 공격할 수 있는지 없는지 구현

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
