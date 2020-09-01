public class Ash extends Hero {
    String tName = "Ash";
    int health = 100;
    int armor = 10;
    int magicArmor = 10;
    int power = 20;
    int attackRange = 20;
    int level = 1;
    int experience = 0;


    Ash(Team team) {
        super(team);

    }

    public String gettName() {
        return this.tName;
    }

    @Override
    public void seleted(String gamer) {
        System.out.println(gamer + "가 " + this.tName + "를 선택했습니다");
    }

    @Override
    public void skill() {
        System.out.println( team + "팀의 " + tName +  "이 skill 사용");
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
        System.out.println("team : " + team);
        System.out.println("magicArmor : " + magicArmor);
        System.out.println("power : " + power);
        System.out.println("level : " + level);
        System.out.println("experience : " + experience);
    }
}
