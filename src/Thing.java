public abstract class Thing {
    private String tName;
    private int health;
    private Team team;
    private int armor;
    private int magicArmor;

    Thing(String tName,int health, Team team, int armor, int magicArmor) {
        this.tName = tName;
        this.health = health;
        this.team = team;
        this.armor = armor;
        this.magicArmor = magicArmor;


    }

    public void attacked(int power) {
        health = health - (power - armor);
        System.out.println(team + "팀의 " + tName + "이(가)" + (power-armor) + " 의 피해를 받았습니다.");
        System.out.println(team + "팀의 " + tName + "의 체력은 " + health + " 남았습니다.");
    }

    public void status() {

        System.out.println("name : " + tName);
        System.out.println("health : " + health);
        System.out.println("armor : " + armor);
        System.out.println("magicArmor : " + magicArmor);

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
}
