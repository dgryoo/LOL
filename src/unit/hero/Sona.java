package unit.hero;

import action.attack.attacks.SonaAttack;
import basicClass.Hero;
import basicClass.TeamEnum;

public class Sona extends Hero {

    public Sona(TeamEnum team) {
        super("Sona", 80, team, 10, 30, 15,20);
        setAttack(new SonaAttack());
    }

}
