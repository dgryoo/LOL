import java.util.ArrayList;
import java.util.List;

public class Gamer {

    private String uName;
    private List<Hero> heroList = new ArrayList();
    /*static {
        System.out.println(uName + "님이 " +hero.tName + " 을 선택하셨습니다.");
    }*/

    Gamer(String uName) {
        this.uName = uName;
        System.out.println(uName + "님이 게임에 참가하셨습니다");
    }


    public void addHero(Hero hero) {
        heroList.add(hero);
        System.out.println(uName + "이 " + hero.gettName() + "를 선택했습니다");
    }

    public List<Hero> getHeroList() {
        return this.heroList;
    }

    public String getuName() {
        return uName;
    }
}
