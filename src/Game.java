import java.util.*;

public class Game {

    public static void main(String[] args) {

        Gamer gamer = new Gamer("ryoo");

        gamer.setHero(new Ash(Team.BLUE));

        gamer.getHero().skill();
        gamer.getHero().status();

        /*System.out.println("Ash Hero Test---------------------------------------------------");
        Ash ash = new Ash(Team.RED);
        System.out.println(ash.tName);
        System.out.println("Ash Hero Test---------------------------------------------------");*/



        //Ash ash = new Ash(Team.RED);
        //System.out.println(ash.tName);


        /*Hero hero1 = new Ash("user1", Team.RED);
        Hero hero2 = new Ash("user2", Team.RED);
        Hero hero3 = new Ash("user3", Team.BLUE);
        Hero hero4 = new Ash("user4", Team.BLUE);

        Map<String, Hero> heroMap = new HashMap<String, Hero>();

        heroMap.put("ryoo1", hero1);
        heroMap.put("ryoo2", hero2);
        heroMap.put("ryoo3", hero3);
        heroMap.put("ryoo4", hero4);

        hero1.attack(hero2);
        hero1.attack(hero3);
        hero1.status();*/


    }
}
