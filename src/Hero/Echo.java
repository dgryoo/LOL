package Hero;

import AbsClass.Team;
import Hero.Hero;

public class Echo extends Hero {

    public Echo(Team team) {
        super("Hero.Echo", 200, team, 20, 15, 1,1,10, 10);

    }


    @Override
    public void skill() {
        System.out.println( getTeam() + "팀의 " + gettName() +  "이 skill 사용");
    }

    @Override
    public void ultimateSkill() {
        System.out.println("ultimateSkill 사용");
    }
}
