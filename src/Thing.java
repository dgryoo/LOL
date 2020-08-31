public abstract class Thing {
    String name;
    int health;
    Team team;
    int armor;
    int magicArmor;

    Thing(String name, int health, Team team, int armor, int magicArmor) {
        this.name = name;
        this.health = health;
        this.team = team;
        this.armor = armor;
        this.magicArmor = magicArmor;

    }

    public void attacked(int power) {
        health = health - (power - armor);
        System.out.println(name + "이(가)" + (power-armor) + " 의 피해를 받았습니다.");
        System.out.println(name + "의 체력은 " + health + " 남았습니다.");
    }

}
