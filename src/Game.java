import AbsClass.Team;
import Hero.*;
import Tower.CommandTower;

import java.util.*;

public class Game {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //List<String> heroNameList = new ArrayList();

        // 영웅목록 나중에 영웅 개요 추가
        Hero Ash = new Ash(Team.NEUTRAL);
        Hero Echo = new Echo(Team.NEUTRAL);
        Hero Sona = new Sona(Team.NEUTRAL);
        Hero Zed = new Zed(Team.NEUTRAL);
        Hero Leeshin = new Leeshin(Team.NEUTRAL);
        Hero SuperPower = new SuperPower(Team.NEUTRAL);

        // (tName, Hero)를 담을 Map heroSelectMap 생성
        Map<String, Hero> heroSelectMap = new HashMap();

        // heroSelectMap Hero 등록
        heroSelectMap.put(Ash.gettName(), Ash);
        heroSelectMap.put(Echo.gettName(), Echo);
        heroSelectMap.put(Sona.gettName(), Sona);
        heroSelectMap.put(Zed.gettName(), Zed);
        heroSelectMap.put(Leeshin.gettName(), Leeshin);
        heroSelectMap.put(SuperPower.gettName(), SuperPower);

        // heroSelectMap의 key인 tName을 List로 변환
        List<String> heroSelectList = new ArrayList(heroSelectMap.keySet());

        System.out.println(heroSelectList);

        // 게이머 생성
        Gamer gamer1 = new Gamer("gamer1");
        gamer1.setTeam(Team.BLUE);
        Gamer gamer2 = new Gamer("gamer2");
        gamer2.setTeam(Team.RED);

        // 커맨드타워 생성
        CommandTower commandTower1 = new CommandTower(Team.BLUE);
        CommandTower commandTower2 = new CommandTower(Team.RED);



        /*List<Gamer> listRed = new ArrayList<Gamer>();
        List<Gamer> listBlue = new ArrayList<Gamer>();*/

        // 영웅선택순서를 위한 변수 int heroSelectTurn
        int heroSelectTurn = 1;

        // 영웅 선택을 위한 게이머, 팀 변수 생성
        Gamer selectGamer = null;

        // 영웅 선택
        while (gamer1.getHeroList().size() != 3 || gamer2.getHeroList().size() != 3) {
            /*if (turn) {
                selectGamer = gamer1;
            } else {
                selectGamer = gamer2;
            }*/

            switch (heroSelectTurn) {
                case 1:
                    selectGamer = gamer1;
                    break;
                case 2:
                    selectGamer = gamer2;
                    break;
                case 3:
                    selectGamer = gamer2;
                    break;
                case 4:
                    selectGamer = gamer1;
                    break;
                case 5:
                    selectGamer = gamer1;
                    break;
                case 6:
                    selectGamer = gamer2;
                    break;
            }

            heroSelectTurn++;

            System.out.println(selectGamer.getuName() + "님 영웅을 선택해주세요");

            System.out.println("------------------------------------------");
            // heroSelectList에 있는 Hero들을 보여줌
            for (String heroName : heroSelectList) {
                System.out.println((heroSelectList.indexOf(heroName) + 1) + ". " + heroName);
            }
            /*for (String name : heroNameList) {
                System.out.println("- " + name);
            }*/
            System.out.println("------------------------------------------");

            System.out.print("번호 : ");
            int heroSelection = scanner.nextInt();

            System.out.println("처리여부 : " + (heroSelection > heroSelectList.size()));

            while (!((heroSelection >= 1) && (heroSelection <= heroSelectList.size()))) {
                System.out.println("번호를 잘 보고 다시 입력해 주세요.");
                for (String heroName : heroSelectList) {
                    System.out.println((heroSelectList.indexOf(heroName) + 1) + ". " + heroName);
                }
                System.out.print("번호 : ");
                heroSelection = scanner.nextInt();
            }

            // Hero의 팀을 Gamer의 팀으로 바꿈
            heroSelectMap.get(heroSelectList.get(heroSelection - 1)).setTeam(selectGamer.getTeam());

            // Map에서 Hero를 가져옴
            selectGamer.addHero(heroSelectMap.get(heroSelectList.get(heroSelection - 1)));


            // List와 Map에서 Hero 제거
            heroSelectMap.remove(heroSelectList.get(heroSelection - 1));
            heroSelectList.remove(heroSelection - 1);

            //
            /*switch (heroAdd) {
                case "Ash":
                    //gamer1.addHero(Ash.getInstance(Team.BLUE));
                    selectGamer.addHero(new Ash(selectGamer.getTeam()));
                    break;
                case "Echo":
                    selectGamer.addHero(new Echo(selectGamer.getTeam()));
                    break;
                case "Sona":
                    selectGamer.addHero(new Sona(selectGamer.getTeam()));
                    break;
                //다른영웅들추가
                default:
                    System.out.println("영웅의 이름을 정확히 입력해주세요.");
            }*/

        }


        // 게임시작
        System.out.println("게임이 시작됩니다.");

        Gamer attackGamer;
        Gamer defendGamer;

        // Gamer1/2 를 구분하기위해 turn 생성
        boolean turn = true;

        while (!commandTower1.isVictory() || !commandTower2.isVictory()) {

            if (turn) {
                attackGamer = gamer1;
                defendGamer = gamer2;
            } else {
                attackGamer = gamer2;
                defendGamer = gamer1;
            }

            // 돌아가면서 한턴씩 실행
            System.out.println(attackGamer.getuName() + "님의 차례입니다.");

            System.out.println("영웅을 선택해주세요");
            // 영웅선택
            for (Hero hero : attackGamer.getHeroList()) {
                System.out.println((attackGamer.getHeroList().indexOf(hero) + 1) + ". " + hero.gettName());
            }
            int selectHero = scanner.nextInt();
            Hero recentHero = attackGamer.getHeroList().get(selectHero - 1);

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
                    System.out.println("공격할 대상을 정해주세요.");
                    System.out.println("------------------------------------------");
                    for (Hero hero : defendGamer.getHeroList()) {
                        System.out.println((defendGamer.getHeroList().indexOf(hero) + 1) + ". " + hero.gettName());
                    }
                    System.out.println("------------------------------------------");

                    while (true) {
                        System.out.print("공격대상 : ");
                        int target = scanner.nextInt();
                        if (target >= 1 && target <= defendGamer.getHeroList().size()) {
                            recentHero.attack(defendGamer.getHeroList().get(target - 1));
                            recentHero.status();
                            break;
                        } else {
                            System.out.println("공격대상을 다시 지정해 주세요.");
                        }
                    }
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
                    recentHero.goHome();


            }

            turn = !turn;
            System.out.println(turn);
        }
    }
}

