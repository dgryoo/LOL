public abstract class Hero extends AttackableThing {

    int level = 1;
    int experience = 0;

    Hero(Team team) {
        super(team);

    }

    abstract public void skill();

    abstract public void ultimateSkill();

    public void status() {

        System.out.println("name : " + tName);
        System.out.println("health : " + health);
        System.out.println("armor : " + armor);
        System.out.println("magicArmor : " + magicArmor);
        System.out.println("power : " + power);
        System.out.println("level : " + level);
        System.out.println("experience : " + experience);

    }

    public void seleted(String gamer) {
        System.out.println(gamer + "가 " + this.tName + "를 선택했습니다");
    }

}
