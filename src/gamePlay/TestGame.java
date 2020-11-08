package gamePlay;

import basicClass.Hero;
import basicClass.TeamEnum;
import unit.hero.Ash;
import unit.hero.Echo;

import java.net.URL;
import java.util.List;

public class TestGame {

    public static void main(String[] Args) {
        Ash ash = new Ash(TeamEnum.RED);
        Echo echo = new Echo(TeamEnum.BLUE);

        ash.skillInit(echo);
    }

}
