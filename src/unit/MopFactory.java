package unit;

import absclass.AttackableMovableThing;
import absclass.TeamEnum;

public class MopFactory {

    public static AttackableMovableThing createMinion(TeamEnum teamEnum) {
        return new Minion(teamEnum);
    }

}
