package hero;

import absclass.AttackableRevivableMovableSkillableThing;
import absclass.Team;

public abstract class Hero extends AttackableRevivableMovableSkillableThing {

    private int level;
    private int experience;



    public Hero(String tName, int health, Team team, int armor, int magicArmor, int power, int attackRange, int x, int y) {
        super(tName, health, team, armor, magicArmor, power, attackRange, x, y);
        this.level = 1;
        this.experience = 0;
    }

    public void goHome() {
        if (getTeam() == Team.BLUE) {
            System.out.println(gettName() + "이 우물로 귀환합니다.");
            setX(3);
            setY(5);
        } else if (getTeam() == Team.RED) {
            System.out.println(gettName() + "이 우물로 귀환합니다.");
            setX(28);
            setY(5);
        }
    }



}


