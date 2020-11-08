package tower;

import basicClass.TeamEnum;
import basicClass.Thing;

public class CommandTower extends Thing {

    private boolean victory = false;

    public CommandTower(TeamEnum team) {
//        super("CommandTower", 300, team, 20, 20);
        super("CommandTower", 10, team, 10, 10);
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
