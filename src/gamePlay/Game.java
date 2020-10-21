package gamePlay;

import absclass.TeamEnum;
import hero.*;
import manager.RevivableManager;

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

            // 선택 할 수 있는 영웅목록
            heroSelectList.stream().forEach(hero -> System.out.println((heroSelectList.indexOf(hero)+1) + ". " + hero.gettName()));

            System.out.println("------------------------------------------");

            System.out.print("번호 : ");
            int heroSelection = scanner.nextInt();

            while (!((heroSelection >= 1) && (heroSelection <= heroSelectList.size()))) {
                System.out.println("번호를 잘 보고 다시 입력해 주세요.");

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
    // TODO playRound, selectHeroActivity, isAttackable, SkillManagement, HeroActivity 정리
    public void playRound(Scanner scanner, Gamer attackGamer, Gamer defendGamer) {

        //checkToRevive
        RevivableManager.getInstance().checkToRevive();


        // 돌아가면서 한턴씩 실행
        System.out.println(attackGamer.getuName() + "님의 차례입니다.");

        System.out.println("영웅을 선택해주세요");
        // 영웅선택
        for (Hero hero : attackGamer.getAliveHeroList()) {
            System.out.println((attackGamer.getAliveHeroList().indexOf(hero) + 1) + ". " + hero.gettName());
        }
        int selectHero = scanner.nextInt();
        Hero recentHero = attackGamer.getAliveHeroList().get(selectHero - 1);

        // 영웅의 행동 선택
        selectHeroActivity(scanner, recentHero, defendGamer.getAliveHeroList());


    }

    private void selectHeroActivity(Scanner scanner, Hero recentHero, List<Hero> defendHeros) {
        System.out.println(recentHero.gettName() + "는 무엇을 할까요?");
//        Arrays.asList(HeroActivity.values()).forEach(heroActivity ->
//                System.out.println(heroActivity.getNum() + ". " + heroActivity.getOption())
//        );

        Arrays.stream(HeroActivity.values())
                .map(heroActivity -> heroActivity.getNum() + ". " + heroActivity.getOption())
                .forEach(System.out::println);

        int heroAction = scanner.nextInt();

        switch (HeroActivity.valueOf(heroAction)) {
            case ATTACK:
                System.out.println("공격할 대상을 정해주세요.");
                System.out.println("------------------------------------------");
                for (Hero hero : defendHeros) {
                    System.out.println((defendHeros.indexOf(hero) + 1) + ". " + hero.gettName() + " health : " + hero.getHealth());
                }

//                defendHeros.stream()
//                        .filter(defendHeros -> defendHeros.gettName() + )

                System.out.println("------------------------------------------");

                while (true) {
                    System.out.print("공격대상 : ");
                    int target = scanner.nextInt();
                    if (isAttackable(target, defendHeros.size())) {
                        if (recentHero.isAttack(defendHeros.get(target - 1))) {
                            recentHero.attack(defendHeros.get(target - 1));
                            System.out.println(recentHero);
                            break;
                        } else {
                            System.out.println("사정거리가 안됩니다.");
                        }

                    } else {
                        System.out.println("공격대상을 다시 지정해 주세요.");
                    }
                }
                break;

            case SKILL:
                System.out.println("공격할 대상을 정해주세요.");
                System.out.println("------------------------------------------");
                for (Hero hero : defendHeros) {
                    System.out.println((defendHeros.indexOf(hero) + 1) + ". " + hero.gettName() + " health : " + hero.getHealth());
                }

                while (true) {
                    System.out.print("공격대상 : ");
                    int target = scanner.nextInt();
                    if (isAttackable(target, defendHeros.size())) {
                        if (recentHero.isAttack(defendHeros.get(target - 1))) {
                            skillAttackedManagement(recentHero, defendHeros.get(target - 1));
                            System.out.println(recentHero);
                            break;
                        } else {
                            System.out.println("사정거리가 안됩니다.");
                        }

                    } else {
                        System.out.println("공격대상을 다시 지정해 주세요.");
                    }
                }

                break;

            case MOVE:
                System.out.print("방향을 입력해주세요 :");
                int direction = scanner.nextInt();
                recentHero.move(direction);
                break;

            case GOHOME:
                recentHero.goHome();
                break;
            case NONE:
                System.out.println("알 수 없는 옵션입니다. 다시 선택해 주세요.");
                selectHeroActivity(scanner, recentHero, defendHeros);
                break;

        }
    }

    private static boolean isAttackable(int target, int numOfHeros) {

        return target > 0 && target <= numOfHeros;
    }

}