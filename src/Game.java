import absclass.TeamEnum;
import hero.*;

import java.util.*;

public class Game {

    private Team blue = new Team(TeamEnum.BLUE);
    private Team red = new Team(TeamEnum.RED);
    private Team neutral;

    public Team getBlue() {
        return blue;
    }

    public void setBlue(Team blue) {
        this.blue = blue;
    }

    public Team getRed() {
        return red;
    }

    public void setRed(Team red) {
        this.red = red;
    }

    public Team getNeutral() {
        return neutral;
    }

    public void setNeutral(Team neutral) {
        this.neutral = neutral;
    }

    public void randomTeamSelect(String user1, String user2, int randomTeam) {
        // 기본정보 생성

        if (randomTeam == 1) {
            blue.setUserName(user1);
            red.setUserName(user2);
        } else {
            blue.setUserName(user2);
            red.setUserName(user1);
        }

    }

    public void selectHero(List<Hero> heroSelectList ,Scanner scanner) {
        // 영웅선택순서를 위한 변수 int heroSelectTurn
        int heroSelectTurn = 1;

        // 영웅 선택을 위한 게이머, 팀 변수 생성
        Team recentSelectTeam = null;

        // 순서 정하기
        while (blue.getHeroList().size() != 3 || red.getHeroList().size() != 3) {

            switch (heroSelectTurn) {
                case 1:
                    recentSelectTeam = blue;
                    break;
                case 2:
                    recentSelectTeam = red;
                    break;
                case 3:
                    recentSelectTeam = red;
                    break;
                case 4:
                    recentSelectTeam = blue;
                    break;
                case 5:
                    recentSelectTeam = blue;
                    break;
                case 6:
                    recentSelectTeam = red;
                    break;
            }

            heroSelectTurn++;

            // 영웅선택
            System.out.println(recentSelectTeam.getUserName() + "님 영웅을 선택해주세요");

            System.out.println("------------------------------------------");
            // heroSelectList에 있는 Hero들을 보여줌
//            for (String heroName : heroSelectList) {
//                System.out.println((heroSelectList.indexOf(heroName) + 1) + ". " + heroName);
//            }

            heroSelectList.stream().forEach(hero -> System.out.println((heroSelectList.indexOf(hero)+1) + ". " + hero.gettName()));
            /*for (String name : heroNameList) {
                System.out.println("- " + name);
            }*/
            System.out.println("------------------------------------------");

            System.out.print("번호 : ");
            int heroSelection = scanner.nextInt();

            while (!((heroSelection >= 1) && (heroSelection <= heroSelectList.size()))) {
                System.out.println("번호를 잘 보고 다시 입력해 주세요.");
//                for (String heroName : heroSelectList) {
//                    System.out.println((heroSelectList.indexOf(heroName) + 1) + ". " + heroName);
//                }
                heroSelectList.stream().forEach(hero -> System.out.println((heroSelectList.indexOf(hero)+1) + ". " + hero.gettName()));
                System.out.print("번호 : ");
                heroSelection = scanner.nextInt();


            }
            // 메소드의 변수로 받은 heroSelectList에서 영웅 불러옴
            Hero selectedHero = heroSelectList.get(heroSelection-1);

            // 영웅의 팀 현재 선택팀으로 바꿔줌
            selectedHero.setTeam(recentSelectTeam.getTeamEnum());

            // 현재 팀에 선택한 영웅 추가
            recentSelectTeam.addHero(selectedHero);

            // 메소드 변수로 받은 heroSelectList에서 영웅 제거
            heroSelectList.remove(selectedHero);
        }


    }
}