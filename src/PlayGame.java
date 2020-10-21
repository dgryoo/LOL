import absclass.AttackableRevivableMovableSkillableThing;
import absclass.TeamEnum;
import hero.*;
import inter.Skill;
import manager.RevivableManager;
import defaultThing.CommandTower;

import java.sql.SQLOutput;
import java.util.*;

public class PlayGame {

    public static void main(String[] args) {

        // 게임 생성
        Game game = new Game();

        // scanner 생성
        Scanner scanner = new Scanner(System.in);

        // random 팀 선택을 위한 난수
        int randomTeam = (int) ((Math.random() * (3 - 1)) + 1);

        // 유저 이름 입력
        System.out.println("유저이름을 설정하세요");
        System.out.print("user1 : ");
        String user1 = scanner.next();
        System.out.print("user2 : ");
        String user2 = scanner.next();

        // 입력된 userName으로 팀에 할당
        game.randomTeamSelect(user1, user2, randomTeam);


        // 영웅목록 만들기 나중에 영웅 개요 추가
        Hero Ash = new Ash(TeamEnum.NEUTRAL);
        Hero Echo = new Echo(TeamEnum.NEUTRAL);
        Hero Sona = new Sona(TeamEnum.NEUTRAL);
        Hero Zed = new Zed(TeamEnum.NEUTRAL);
        Hero Leeshin = new Leeshin(TeamEnum.NEUTRAL);
        Hero SuperPower = new SuperPower(TeamEnum.NEUTRAL);
        Ash Ash2 = new Ash(TeamEnum.NEUTRAL);

        List<Hero> selectHeroList = new ArrayList<>();
        selectHeroList.add(Ash);
        selectHeroList.add(Echo);
        selectHeroList.add(Sona);
        selectHeroList.add(Zed);
        selectHeroList.add(Leeshin);
        selectHeroList.add(SuperPower);

        // 영웅선택
        game.selectHero(selectHeroList, scanner);












    }
}
