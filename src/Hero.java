public abstract class Hero extends AttackableThing {
    int level = 1;
    int experience = 0;

    Hero(String name, int health, Team team, int armor, int magicArmor, int power, int attackRange) {
        super(name,health, team, armor, magicArmor, power, attackRange);
    }

    abstract public void skill(Thing thing);
    abstract public void ultimateSkill(Thing thing);

}
