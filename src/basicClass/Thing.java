package basicClass;

import manager.LocationUtil;
import org.apache.commons.lang3.tuple.Pair;

public abstract class Thing {
    private String tName;
    private int maxHealth;
    private int health;
    private TeamEnum team;
    private int armor;
    private int magicArmor;
    private int x;
    private int y;
    private boolean state = true;

    public Thing(String tName, int health, TeamEnum team, int armor, int magicArmor) {
        Pair<Integer, Integer> pair = LocationUtil.getBaseLocation(team, this.getClass());
        this.tName = tName;
        this.health = health;
        this.team = team;
        this.armor = armor;
        this.magicArmor = magicArmor;
        this.x = pair.getLeft();
        this.y = pair.getRight();
        this.maxHealth = health;


    }



    public void attacked(int power) {

        health = health - (power-armor);

        if (this.health <= 0) {
            System.out.println(team + "팀의 " + tName + "이(가)" + (power - armor) + " 의 피해를 받았습니다.");
            dead();
        } else {
            System.out.println(team + "팀의 " + tName + "이(가)" + (power - armor) + " 의 피해를 받았습니다.");
            System.out.println(team + "팀의 " + tName + "의 체력은 " + health + " 남았습니다.");
        }
    }

    public void status() {

        System.out.println("name : " + tName);
        System.out.println("health : " + health);
        System.out.println("armor : " + armor);
        System.out.println("magicArmor : " + magicArmor);

    }

    public void dead() {
        System.out.println(team + "팀의 " + tName + "이(가)" + " 죽었습니다");
        state = false;
    }

    public String gettName() {
        return tName;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public TeamEnum getTeam() {
        return team;
    }

    public int getArmor() {
        return armor;
    }

    public int getMagicArmor() {
        return magicArmor;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setTeam(TeamEnum team) {
        this.team = team;
    }

    public boolean isState() {
        return state;
    }

    public int getMaxHealth() {
        return maxHealth;
    }

    public void setMaxHealth(int maxHealth) {
        this.maxHealth = maxHealth;
    }

    public void setState(boolean state) {
        this.state = state;
    }

    public void defaultLocation() {
    }

    @Override
    public String toString() {
        return "Thing{" +
                "tName='" + tName + '\'' +
                ", health=" + health +
                ", team=" + team +
                ", armor=" + armor +
                ", magicArmor=" + magicArmor +
                ", x=" + x +
                ", y=" + y +
                '}';
    }

    public boolean isAlive() {
        return state;
    }

}
