public class Echo extends Hero {

    String tName = "Echo";
    int health = 150;
    Team team;
    int armor = 15;
    int magicArmor = 15;
    int power = 30;
    int attackRange = 5;
    int level = 1;
    int experience = 0;


    Echo(Team team) {
        super(team);


    }

    @Override
    public void skill() {
        System.out.println("skill 사용");
    }

    @Override
    public void ultimateSkill() {
        System.out.println("ultimateSkill 사용");
    }

    @Override
    public void status() {
        System.out.println("name : " + tName);
        System.out.println("health : " + health);
        System.out.println("armor : " + armor);
        System.out.println("magicArmor : " + magicArmor);
        System.out.println("power : " + power);
        System.out.println("level : " + level);
        System.out.println("experience : " + experience);
    }

}
