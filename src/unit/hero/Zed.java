package unit.hero;

import absclass.TeamEnum;

public class Zed extends Hero {

    //private static Ash ash;

    public Zed(TeamEnum team) {
        super("Zed", 80, team, 10, 10, 40,10);

    }

    /*public static Ash getInstance(gamePlay.Team team) {
        if (ash == null) {
            ash = new Ash(team);
            return ash;
        } else {
            System.out.println("Ash는 이미 선택되어있습니다.");
            System.out.println("다른 영웅을 선택해주세요.");
            return null;
        }
    }*/

}
