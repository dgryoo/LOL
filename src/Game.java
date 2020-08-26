public class Game {

    public static void main(String[] args) {
        //Thing thing = new Thing(0, Team.BLUE);
        AttackableThing attackableThing = new AttackableThing(0,Team.BLUE,0);

        System.out.println(" attack range : " + attackableThing.attackRange);
        System.out.println(" health : " + attackableThing.health);
        System.out.println(" team : " + attackableThing.team);

    }
}
