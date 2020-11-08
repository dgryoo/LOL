package basicClass;

import tower.CommandTower;
import tower.SuppressTower;
import tower.TurretTower;
import unit.minion.Minion;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Team {
    private String userName;
    private TeamEnum teamEnum;
    private CommandTower commandTower;
    private SuppressTower suppressTower;
    private TurretTower turretTower;
    private List<Hero> heroList = new ArrayList();
    private List<Minion> minionList = new ArrayList();

    public Team(TeamEnum teamEnum) {
        this.teamEnum = teamEnum;
        this.commandTower = new CommandTower(teamEnum);
        System.out.println(commandTower);
        this.suppressTower = new SuppressTower(teamEnum);
        this.turretTower = new TurretTower(teamEnum);
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
        System.out.println(userName + "님은 " + teamEnum + "팀 입니다");
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
        hero.setTeam(teamEnum);
        heroList.add(hero);
        System.out.println(teamEnum + "팀 " + userName + "님이 " + hero.gettName()+ "을 선택");
    }

    public List<Hero> getAliveHeroList() {
        return this.heroList.stream().filter(hero -> hero.isAlive()).collect(Collectors.toList());
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
