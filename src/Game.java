public class Game {

    public static void main(String[] args) {
        //Thing thing = new Thing(0, Team.BLUE);
        Hero hero1 = new Hero("Hero1",100,Team.BLUE,10, 20, 30, 30);
        Hero hero2 = new Hero("Hero2",100,Team.BLUE,10, 20, 30, 30);
        Hero hero3 = new Hero("Hero3",100,Team.RED,10, 20, 30, 30);

        hero1.attack(hero2);
        hero1.attack(hero3);

    }
}
