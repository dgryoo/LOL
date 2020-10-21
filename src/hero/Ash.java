package hero;

import absclass.TeamEnum;

public class Ash extends Hero {

    //private static Ash ash;

    public Ash(TeamEnum team) {
        super("Ash", 100, team, 10, 10, 20, 20, 0, 0);


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
