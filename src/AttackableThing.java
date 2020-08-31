public abstract class AttackableThing extends Thing {
    int power;
    int attackRange;



    AttackableThing(String name, int health, Team team, int armor, int magicArmor, int power, int attackRange) {
        super(name, health, team, armor, magicArmor);
        this.power = power;
        this.attackRange = attackRange;


    }

    public void attack(Thing thing) {
        if (team == thing.team) {
            System.out.println("같은팀을 공격할 수 없습니다.");
        } else {

        System.out.println(this.name + "이(가) " + this.power + "의 공격력으로 " + thing.name + " 을 공격했습니다." );
        thing.attacked(this.power);

        }
    }


}
