public abstract class Thing {
    String tName;
    int health;
    Team team;
    int armor;
    int magicArmor;

    Thing(Team team) {
        this.team = team;


    }

    public void attacked(int power) {
        health = health - (power - armor);
        System.out.println(tName + "이(가)" + (power-armor) + " 의 피해를 받았습니다.");
        System.out.println(tName + "의 체력은 " + health + " 남았습니다.");
    }

}
