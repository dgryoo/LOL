package AbsClass;

public abstract class Thing {
    private String tName;
    private int health;
    private Team team;
    private int armor;
    private int magicArmor;
    private int x;
    private int y;


    Thing(String tName, int health, Team team, int armor, int magicArmor, int x, int y) {
        this.tName = tName;
        this.health = health;
        this.team = team;
        this.armor = armor;
        this.magicArmor = magicArmor;
        this.x = x;
        this.y = y;


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
    }

    public String gettName() {
        return tName;
    }

    public int getHealth() {
        return health;
    }

    public Team getTeam() {
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

    public void setTeam(Team team) {
        this.team = team;
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

}
