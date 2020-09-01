public class Sona extends Hero {
    String tName = "Sona";
    int health = 80;
    Team team;
    int armor = 5;
    int magicArmor = 15;
    int power = 10;
    int attackRange = 25;
    int level = 1;
    int experience = 0;


    Sona(Team team) {
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
