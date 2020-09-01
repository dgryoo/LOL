public class Gamer {

    String uName;
    Hero hero;
    /*static {
        System.out.println(uName + "님이 " +hero.tName + " 을 선택하셨습니다.");
    }*/

    Gamer(String uName) {
        this.uName = uName;
        System.out.println(uName + "님이 게임에 참가하셨습니다");
    }


    public void setHero(Hero hero) {
        this.hero = hero;
        hero.seleted(this.uName);

    }

    public Hero getHero() {
        return this.hero;
    }
}
