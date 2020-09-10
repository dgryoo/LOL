package Tower;

import AbsClass.RevivableThing;
import AbsClass.Team;

public class SuppressTower extends RevivableThing {

    public SuppressTower(Team team) {
        super("SuppressTower", 150, team, 10, 10, 0, 0);
    }

    @Override
    public void dead() {

    }

    @Override
    public void revive() {
        // 5턴 뒤에
    }
}
