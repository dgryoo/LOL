package unit.minion;

import action.attack.Attack;
import action.attack.Attackable;
import action.move.Movable;
import action.move.moves.MoveBehavior;
import action.skilled.Skilled;
import action.skilled.Skilledable;
import basicClass.TeamEnum;
import basicClass.Thing;

public class Minion extends Thing implements Attackable, Movable, Skilledable {

    public Attack attack;
    private MoveBehavior moveBehavior = new MoveBehavior();
    private Skilled skilled = new Skilled();
    private int power;
    private int attackRange;

    public Minion(TeamEnum team) {
        super("미니언", 50, team, 10, 10);
        this.power = power;
        this.attackRange = attackRange;
    }

    @Override
    public void attackinit(Thing thing) {
        attack.attack(power, thing);
    }

    @Override
    public boolean isAttack(Thing thing) {
        if (Math.sqrt(Math.pow(this.getX() - thing.getX(), 2) + Math.pow(this.getY() - thing.getY(), 2)) <= attackRange) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public void move(int direction) {
        moveBehavior.moveUnit(this,direction);
    }

    @Override
    public void skilled(int power) {
        skilled.skilled(power, this);
    }

}
