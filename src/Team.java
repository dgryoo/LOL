
import absclass.TeamEnum;
import defaultThing.CommandTower;
import defaultThing.Minion;
import defaultThing.SuppressTower;
import defaultThing.TurretTower;
import hero.Hero;

import java.util.ArrayList;
import java.util.List;

public class Team {
    private String userName;
    private TeamEnum teamEnum;
    private CommandTower commandTower;
    private SuppressTower suppressTower;
    private TurretTower turretTower;
    List<Hero> heroList = new ArrayList();
    List<Minion> minionList = new ArrayList();

    public Team(TeamEnum teamEnum) {
        this.teamEnum = teamEnum;
        this.commandTower = new CommandTower(teamEnum);
        this.suppressTower = new SuppressTower(teamEnum);
        this.turretTower = new TurretTower(teamEnum);
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
        System.out.println(userName + "님은 " + teamEnum +"팀 입니다");
    }

    public TeamEnum getTeamEnum() {
        return teamEnum;
    }

    public void setTeamEnum(TeamEnum teamEnum) {
        this.teamEnum = teamEnum;
    }

    public CommandTower getCommandTower() {
        return commandTower;
    }

    public void setCommandTower(CommandTower commandTower) {
        this.commandTower = commandTower;
    }

    public SuppressTower getSuppressTower() {
        return suppressTower;
    }

    public void setSuppressTower(SuppressTower suppressTower) {
        this.suppressTower = suppressTower;
    }

    public TurretTower getTurretTower() {
        return turretTower;
    }

    public void setTurretTower(TurretTower turretTower) {
        this.turretTower = turretTower;
    }

    public List<Hero> getHeroList() {
        return heroList;
    }

    public void setHeroList(List<Hero> heroList) {
        this.heroList = heroList;
    }

    public void addHero(Hero hero) {
        heroList.add(hero);
        System.out.println(userName + "이 " + hero.gettName() + "를 선택했습니다");
    }

    public List<Minion> getMinionList() {
        return minionList;
    }

    public void setMinionList(List<Minion> minionList) {
        this.minionList = minionList;
    }

    public void produceMinion() {
        //TODO 미니언 추가하는거 넣기
    }
}
