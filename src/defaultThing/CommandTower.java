package defaultThing;

import absclass.SkillableThing;
import absclass.TeamEnum;
import manager.LocationUtil;
import org.apache.commons.lang3.tuple.Pair;

public class CommandTower extends SkillableThing {

    private boolean victory;

    public CommandTower(TeamEnum team) {
        super("CommandTower", 300, team, 20, 20);
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
