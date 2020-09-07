package Hero;

import AbsClass.ARMSThing;
import AbsClass.Team;

public abstract class Hero extends ARMSThing {

    private int level;
    private int experience;


    public Hero(String tName, int health, Team team, int armor, int magicArmor, int x, int y, int power, int attackRange) {
        super(tName, health, team, armor, magicArmor, x, y, power, attackRange);
        this.level = 1;
        this.experience = 0;
    }

    public void goHome(Team team) {
        if (team == Team.BLUE) {
            System.out.println(gettName() + "이 우물로 귀환합니다.");
            setX(3);
            setY(5);
        } else if (team == Team.RED) {
            System.out.println(gettName() + "이 우물로 귀환합니다.");
            setX(28);
            setY(5);
        }
    }

}


