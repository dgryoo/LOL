package gamePlay;

import action.skill.Skillable;
import action.skilled.Skilledable;
import basicClass.HeroActivity;
import basicClass.Team;
import basicClass.TeamEnum;
import basicClass.Thing;
import manager.revive.RevivableManager;
import org.apache.commons.lang3.tuple.Pair;
import basicClass.Hero;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

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

    public void selectHero(List<Hero> heroSelectList, Scanner scanner) {
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
            heroSelectList.stream().forEach(hero -> System.out.println((heroSelectList.indexOf(hero) + 1) + ". " + hero.gettName()));

            System.out.println("------------------------------------------");

            System.out.print("번호 : ");
            int heroSelection = scanner.nextInt();

            while (!((heroSelection >= 1) && (heroSelection <= heroSelectList.size()))) {
                System.out.println("번호를 잘 보고 다시 입력해 주세요.");

                heroSelectList.stream().forEach(hero -> System.out.println((heroSelectList.indexOf(hero) + 1) + ". " + hero.gettName()));
                System.out.print("번호 : ");
                heroSelection = scanner.nextInt();


            }
            // 메소드의 변수로 받은 heroSelectList에서 영웅 불러옴
            Hero selectedHero = heroSelectList.get(heroSelection - 1);

            // 영웅의 팀 현재 선택팀으로 바꿔줌
            selectedHero.setTeam(recentSelectTeam.getTeamEnum());

            // 현재 팀에 선택한 영웅 추가
            recentSelectTeam.addHero(selectedHero);

            // 메소드 변수로 받은 heroSelectList에서 영웅 제거
            heroSelectList.remove(selectedHero);
        }


    }

    public void playRound(Scanner scanner, Team attackTeam, Team defendTeam) {

        //checkToRevive
        RevivableManager.getInstance().checkToRevive();


        // 돌아가면서 한턴씩 실행
        System.out.println(attackTeam.getUserName() + "님의 차례입니다.");
        System.out.println("영웅을 선택해주세요");


        // 영웅선택
        Hero recentHero;
        
        while (true) {
            for (Hero hero : attackTeam.getAliveHeroList()) {
                System.out.println((attackTeam.getAliveHeroList().indexOf(hero) + 1) + ". " + hero.gettName());
            }
            int selectHero = scanner.nextInt();
            if (targetCheck(selectHero, attackTeam.getAliveHeroList().size())) {
                recentHero = attackTeam.getAliveHeroList().get(selectHero - 1);
                break;
            } else {
                System.out.println("번호를 정확히 입력하세요.");
            }
        }
        // 영웅의 행동 선택
        selectHeroActivity(scanner, recentHero, defendTeam.getAliveHeroList());
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
                    if (targetCheck(target, defendHeros.size())) {
                        if (recentHero.isAttack(defendHeros.get(target - 1))) {
                            recentHero.attackinit(defendHeros.get(target - 1));
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
                if (recentHero.getSkill().getSkillType() == "r") {
                    System.out.println("시전지역을 정해주세요");
                    System.out.print("x : ");
                    int x = scanner.nextInt();
                    System.out.print("y : ");
                    int y = scanner.nextInt();
                    skillManagement(recentHero, x, y);

                    break;

                } else {
                    System.out.println("공격할 대상을 정해주세요.");
                    System.out.println("------------------------------------------");
                    for (Hero hero : defendHeros) {
                        System.out.println((defendHeros.indexOf(hero) + 1) + ". " + hero.gettName() + " health : " + hero.getHealth());
                    }

                    while (true) {
                        System.out.print("공격대상 : ");
                        int target = scanner.nextInt();
                        if (targetCheck(target, defendHeros.size())) {
                            if (recentHero.isAttack(defendHeros.get(target - 1))) {
                                skillManagement(recentHero, defendHeros.get(target - 1));
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
                }


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

    private static boolean targetCheck(int target, int numOfHeros) {

        return target > 0 && target <= numOfHeros;
    }

    private void skillManagement(Skillable skillable, Skilledable skilledable) {

        skillable.skillInit(skilledable);

    }

    private void skillManagement(Skillable skillable, int x, int y) {

        List<Thing> skilledList = new ArrayList<>();
        skilledList.addAll(blue.getHeroList());
        skilledList.addAll(blue.getMinionList());
        skilledList.addAll(red.getHeroList());
        skilledList.addAll(red.getMinionList());

        skilledList
                .stream()
                .filter(thing -> thing instanceof Skilledable)
                .filter(thing -> getRange(thing, x, y) <= skillable.getSkill().getSkillRange())
                .map(thing -> (Skilledable) thing)
                .forEach(skilledable -> skilledable.skilled(skillable.getSkill().getSkillPower()));

    }

    private double getRange(Thing thing, int x, int y) {
        return getRange(Pair.of(thing.getX(), thing.getY()), Pair.of(x, y));
    }

    private double getRange(Pair<Integer, Integer> from, Pair<Integer, Integer> to) {
        return Math.sqrt(Math.pow(from.getLeft() - to.getLeft(), 2) + Math.pow(from.getRight() - to.getRight(), 2));
    }

}