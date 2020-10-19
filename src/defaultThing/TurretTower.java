package defaultThing;

import absclass.AttackableThing;
import absclass.TeamEnum;

public class TurretTower extends AttackableThing {

    public TurretTower(TeamEnum team) {
        super("TurretTower", 50, team, 10, 10, 5, 30, 0, 0);
    }

}
