package tower;

import absclass.RevivableThing;
import absclass.Team;

public class SuppressTower extends RevivableThing {

    public SuppressTower(Team team) {
        super("SuppressTower", 150, team, 10, 10, 0, 0);
    }


    @Override
    public void dead() {
        super.dead();
    }
}
