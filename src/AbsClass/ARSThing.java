package AbsClass;

import Inter.Skillable;

public class ARSThing extends ARThing implements Skillable {

    public ARSThing(String tName, int health, Team team, int armor, int magicArmor, int power, int attackRange, int x, int y) {
        super(tName, health, team, armor, magicArmor, power, attackRange, x, y);
    }

    @Override
    public void skill() {
        System.out.println(getTeam() + "팀의 " + gettName() + "이 skill 사용");
        // 나중에 team 표시 안해주고 gamer는 서로 다른 챔피언을 고르게끔
    }
}
