package unit;

import basicClass.TeamEnum;
import unit.minion.Minion;

public class MopFactory {

    public static Minion createMinion(TeamEnum teamEnum) {
        return new Minion(teamEnum);
    }

}
