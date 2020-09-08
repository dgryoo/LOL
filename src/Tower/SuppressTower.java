package Tower;

import AbsClass.RThing;
import AbsClass.Team;

public class SuppressTower extends RThing {

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
