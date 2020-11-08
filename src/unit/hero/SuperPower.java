package unit.hero;

import action.attack.attacks.SuperPowerAttack;
import basicClass.Hero;
import basicClass.TeamEnum;

public class SuperPower extends Hero {

    public SuperPower(TeamEnum team) {
        super("SuperPower", 300, team, 50, 50, 100,8);
        setAttack(new SuperPowerAttack());

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
