import AbsClass.Team;
import Hero.*;

import java.util.*;

public class Game {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<String> heroNameList = new ArrayList();

        // 영웅목록 나중에 영웅 개요 추가
        heroNameList.add("Ash");
        heroNameList.add("Echo");
        heroNameList.add("Sona");


        Gamer gamer1 = new Gamer("gamer1");
        Gamer gamer2 = new Gamer("gamer2");

        /*List<Gamer> listRed = new ArrayList<Gamer>();
        List<Gamer> listBlue = new ArrayList<Gamer>();*/

        System.out.println(gamer1.getuName() + "님 영웅을 선택해주세요");

        // gamer1 영웅 선택
        while (gamer1.getHeroList().size() < 3) {
            System.out.println("------------------------------------------");
            for (String name : heroNameList) {
                System.out.println("- " + name);
            }
            System.out.println("------------------------------------------");

            System.out.print("영웅이름 : ");
            String heroAdd = scanner.next();

            switch (heroAdd) {
                case "Ash":
                    //gamer1.addHero(Ash.getInstance(Team.BLUE));
                    gamer1.addHero(new Ash(Team.BLUE));
                    break;
                case "Echo":
                    gamer1.addHero(new Echo(Team.BLUE));
                    break;
                case "Sona":
                    gamer1.addHero(new Sona(Team.BLUE));
                    break;
                //다른영웅들추가

                default:
                    System.out.println("영웅의 이름을 정확히 입력해주세요.");
            }

        }

        System.out.println(gamer2.getuName() + "님 영웅을 선택해주세요");

        // gamer2 영웅 선택
        while (gamer2.getHeroList().size() < 3) {
            System.out.println("------------------------------------------");
            for (String name : heroNameList) {
                System.out.println("- " + name);
            }
            System.out.println("------------------------------------------");
            System.out.print("영웅이름 : ");
            String heroAdd = scanner.next();

            switch (heroAdd) {
                case "Ash":
                    gamer2.addHero(new Ash(Team.RED));
                    break;
                case "Echo":
                    gamer2.addHero(new Echo(Team.RED));
                    break;
                case "Sona":
                    gamer2.addHero(new Sona(Team.RED));
                    break;
                //다른영웅들추가
                default:
                    System.out.println("영웅의 이름을 정확히 입력해주세요.");
            }

        }

        // 게임시작
        System.out.println("게임이 시작됩니다.");
        while (true) {
            // 돌아가면서 한턴씩 실행
            System.out.println(gamer1.getuName() + "님의 차례입니다.");

            System.out.println("영웅을 선택해주세요");
            // 영웅선택
            for (Hero hero : gamer1.getHeroList()) {
                System.out.println((gamer1.getHeroList().indexOf(hero) + 1) + ". " + hero.gettName());
            }
            int selectHero = scanner.nextInt();
            Hero recentHero = gamer1.getHeroList().get(selectHero - 1);

            // 영웅의 행동 선택
            System.out.println(recentHero.gettName() + "는 무엇을 할까요?");
            System.out.println("1. 공격");
            System.out.println("2. 스킬사용");
            System.out.println("3. 이동");
            System.out.println("4. 귀환");
            //System.out.println("5. 뒤로가기");

            int heroAction = scanner.nextInt();

            switch (heroAction) {
                case 1:
                    System.out.println("누구를 공격할까요?");
                    System.out.println("------------------------------------------");
                    for (Hero hero : gamer2.getHeroList()) {
                        System.out.println((gamer2.getHeroList().indexOf(hero) + 1) + ". " + hero.gettName());
                    }
                    System.out.println("------------------------------------------");
                    System.out.print("공격할 대상을 정해주세요.");
                    int target = scanner.nextInt();
                    recentHero.attack(gamer2.getHeroList().get(target - 1));
                    break;

                case 2:
                    recentHero.skill();
                    break;

                case 3:
                    System.out.print("방향을 입력해주세요 :");
                    int direction = scanner.nextInt();
                    recentHero.move(direction);
                    break;

                case 4:
                    recentHero.goHome(recentHero.getTeam());


            }

        /*while (true) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("팀을 선택하세요");
            System.out.println("1. BLUE");
            System.out.println("2. RED");
            int teamSelect = scanner.nextInt();
            if (teamSelect == 1) {
                System.out.println("영웅을 선택하세요");
                for (Gamer gamer : listBlue) {
                    for (Hero.Hero hero : gamer.getHeroList()) {
                        for (int i = 0; i < gamer.getHeroList().size(); i++) {
                            System.out.println(i + 1 + ". " + hero.gettName());
                        }
                    }
                }


            }
        }*/

        }
    }


        /*System.out.println("Hero.Ash Hero.Hero Test---------------------------------------------------");
        Hero.Ash ash = new Hero.Ash(AbsClass.Team.RED);
        System.out.println(ash.tName);
        System.out.println("Hero.Ash Hero.Hero Test---------------------------------------------------");*/


    //Hero.Ash ash = new Hero.Ash(AbsClass.Team.RED);
    //System.out.println(ash.tName);


        /*Hero.Hero hero1 = new Hero.Ash("user1", AbsClass.Team.RED);
        Hero.Hero hero2 = new Hero.Ash("user2", AbsClass.Team.RED);
        Hero.Hero hero3 = new Hero.Ash("user3", AbsClass.Team.BLUE);
        Hero.Hero hero4 = new Hero.Ash("user4", AbsClass.Team.BLUE);

        Map<String, Hero.Hero> heroMap = new HashMap<String, Hero.Hero>();

        heroMap.put("ryoo1", hero1);
        heroMap.put("ryoo2", hero2);
        heroMap.put("ryoo3", hero3);
        heroMap.put("ryoo4", hero4);

        hero1.attack(hero2);
        hero1.attack(hero3);
        hero1.status();*/


}

