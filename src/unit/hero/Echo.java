package unit.hero;

import action.attack.attacks.EchoAttack;
import basicClass.Hero;
import basicClass.TeamEnum;

public class Echo extends Hero {

    public Echo(TeamEnum team) {
        super("Echo", 200, team, 20, 15, 10, 10);
        setAttack(new EchoAttack());

    }

}
