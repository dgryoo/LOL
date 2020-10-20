import absclass.TeamEnum;
import hero.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Game {

    private Team blue = new Team(TeamEnum.BLUE);
    private Team red = new Team(TeamEnum.RED);
    private Team neutral;
    private List<Hero> heroSelectList;

    public Team getBlue() {
        return blue;
    }

    public void setBlue(Team blue) {
        this.blue = blue;
    }

    public Team getRed() {
        return red;
    }

    public void setRed(Team red) {
        this.red = red;
    }

    public Team getNeutral() {
        return neutral;
    }

    public void setNeutral(Team neutral) {
        this.neutral = neutral;
    }

    public List<Hero> getHeroSelectList() {
        return heroSelectList;
    }

    public void setHeroSelectList(List<Hero> heroSelectList) {
        this.heroSelectList = heroSelectList;
    }

    public void randomTeamSelect(String user1, String user2, int randomTeam) {
        // 기본정보 생성

        if (randomTeam == 1) {
            blue.setUserName(user1);
            red.setUserName(user2);
        } else {
            blue.setUserName(user2);
            red.setUserName(user1);
        }

    }




}