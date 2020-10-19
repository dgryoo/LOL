import absclass.TeamEnum;
import absclass.Thing;
import hero.Hero;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Gamer {

    private String uName;
    private TeamEnum team;
    private List<Hero> heroList = new ArrayList();
    private List<Thing> thingList = new ArrayList();
    //deadHero
    /*static {
        System.out.println(uName + "님이 " +hero.tName + " 을 선택하셨습니다.");
    }*/

    Gamer(String uName) {
        this.uName = uName;
        System.out.println(uName + "님이 게임에 참가하셨습니다");
    }


    public void addHero(Hero hero) {
        heroList.add(hero);
        System.out.println(uName + "이 " + hero.gettName() + "를 선택했습니다");
    }

    public List<Hero> getHeroList() {
        return this.heroList;
    }

    public List<Hero> getAliveHeroList() {
        return this.heroList.stream().filter(hero -> hero.isAlive()).collect(Collectors.toList());
    }

    public String getuName() {
        return uName;
    }

    public TeamEnum getTeam() {
        return team;
    }

    public void setTeam(TeamEnum team) {
        this.team = team;
    }
}
