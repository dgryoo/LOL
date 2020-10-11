package tower;

import absclass.SkillableThing;
import absclass.Team;

public class CommandTower extends SkillableThing {

    private boolean victory;

    public CommandTower(Team team) {
        super("CommandTower", 300, team, 20, 20, 0, 0);
        if (team == Team.BLUE) {
            setX(2);
            setY(5);
        } else if (team == Team.RED) {
            setX(29);
            setY(5);
        }
        this.victory = false;
        System.out.println(getTeam()+ "팀 CommandTower 생성");
    }


    @Override
    public void dead() {
        isVictory();

    }

    public boolean isVictory() {
        return victory;
    }

    public void setVictory() {
        System.out.println(this.getTeam() + "팀 승리");
        this.victory = !this.victory;
    }
}
