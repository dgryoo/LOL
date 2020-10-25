package defaultThing;

import absclass.RevivableThing;
import absclass.TeamEnum;

public class SuppressTower extends RevivableThing {

    public SuppressTower(TeamEnum team) {
        super("SuppressTower", 150, team, 10, 10);
    }


    @Override
    public void dead() {
        super.dead();
    }
}
