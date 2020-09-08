package Hero;

import AbsClass.Team;
import AbsClass.Thing;

public class SuperPower extends Hero {

    //private static Ash ash;

    public SuperPower(Team team) {
        super("SuperPower", 300, team, 50, 50, 100,8, 0,0);

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
