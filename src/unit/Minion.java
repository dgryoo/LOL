package unit;

import absclass.AttackableMovableThing;
import absclass.TeamEnum;

public class Minion extends AttackableMovableThing {

    public Minion(TeamEnum team) {
        super("미니언", 50, team, 10, 10, 20, 1);
    }

}
