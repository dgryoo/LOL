public abstract class Hero extends AttackableThing {

    private int level;
    private int experience;


    public Hero(String tName, int health, Team team, int armor, int magicArmor, int power, int attackRange) {
        super(tName, health, team, armor, magicArmor, power, attackRange);
        this.level = 1;
        this.experience = 0;

    }

    abstract public void skill();

    abstract public void ultimateSkill();

    @Override
    public void status() {

        super.status();
        System.out.println("level : " + level);
        System.out.println("experience : " + experience);

    }

}
