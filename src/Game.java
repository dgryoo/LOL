import java.util.*;

public class Game {

    public static void main(String[] args) {

        Gamer gamer1 = new Gamer("ryoo");
        Gamer gamer2 = new Gamer("ryoo");

        List<Gamer> listBlue = new ArrayList<Gamer>();
        List<Gamer> listRed = new ArrayList<Gamer>();

        gamer1.addHero(new Ash(Team.BLUE));
        gamer2.addHero(new Ash(Team.RED));

        listBlue.add(gamer1);
        listRed.add(gamer2);

        while (true) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("팀을 선택하세요");
            System.out.println("1. BLUE");
            System.out.println("2. RED");
            int teamSelect = scanner.nextInt();
            if (teamSelect == 1) {
                System.out.println("영웅을 선택하세요");
                for (Gamer gamer : listBlue) {
                    for (Hero hero : gamer.getHeroList()) {
                        for (int i = 0; i < gamer.getHeroList().size(); i++) {
                            System.out.println(i + 1 + ". " + hero.gettName());
                        }
                    }
                }


            }
        }


    }


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

