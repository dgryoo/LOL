package Hero;

import AbsClass.Team;
import Hero.Hero;

public class Sona extends Hero {

    public Sona(Team team) {
        super("Hero.Sona", 80, team, 10, 30, 1,1,15, 20);

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
