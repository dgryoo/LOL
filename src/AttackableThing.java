public class AttackableThing extends Thing {

    int attackRange;



    AttackableThing(int health, Team team, int attackRange) {
        super(health, team);
        this.attackRange = attackRange;

    }



}
