package hero;

import absclass.TeamEnum;

public class Leeshin extends Hero {

    //private static Ash ash;

    public Leeshin(TeamEnum team) {
        super("Leeshin", 120, team, 15, 15, 30, 15, 0,0);

    }

    /*public static Ash getInstance(Team team) {
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
