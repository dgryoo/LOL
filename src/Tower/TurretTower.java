package Tower;

import AbsClass.AThing;
import AbsClass.Team;

public class TurretTower extends AThing {

    public TurretTower(String tName, int health, Team team, int armor, int magicArmor, int power, int attackRange, int x, int y) {
        super("TurretTower", 50, team, 10, 10, 5, 30, 0, 0);
    }

}
