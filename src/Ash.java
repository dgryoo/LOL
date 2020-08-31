public class Ash extends Hero {


    Ash(String name, int health, Team team, int armor, int magicArmor, int power, int attackRange) {
        super(name, health, team, armor, magicArmor, power, attackRange);
    }

    @Override
    public void skill(Thing thing) {
        System.out.println("hi");
    }

    @Override
    public void ultimateSkill(Thing thing) {
        System.out.println("hihi");
    }
}
