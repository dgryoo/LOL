package unit.hero;

import action.attack.attacks.ZedAttack;
import basicClass.Hero;
import basicClass.TeamEnum;

public class Zed extends Hero {

    //private static Ash ash;

    public Zed(TeamEnum team) {
        super("Zed", 80, team, 10, 10, 40,10);
        setAttack(new ZedAttack());
    }

    /*public static Ash getInstance(basicClass.Team team) {
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
