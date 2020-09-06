package Hero;

import AbsClass.Team;
import Hero.Hero;

public class Ash extends Hero {

    public Ash(Team team) {
        super("Hero.Ash", 100, team, 10, 10, 10, 10, 20, 20);

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
