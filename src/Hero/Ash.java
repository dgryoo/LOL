package Hero;

import AbsClass.Team;

public class Ash extends Hero {

    //private static Ash ash;

    public Ash(Team team) {
        super("Ash", 100, team, 10, 10, 10, 10, 20, 20);

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
