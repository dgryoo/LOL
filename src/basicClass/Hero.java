package basicClass;

import action.attack.Attack;
import action.attack.Attackable;
import action.move.Movable;
import action.move.moves.MoveBehavior;
import action.skill.Skill;
import action.skill.SkillAttack;
import action.skill.Skillable;
import action.skill.TestSkill;
import action.skilled.Skilled;
import action.skilled.Skilledable;
import manager.revive.Revivable;
import manager.revive.RevivableManager;

public abstract class Hero extends Thing implements Attackable, Movable, Skillable, Skilledable, Revivable {

    public Attack attack;
    private MoveBehavior moveBehavior = new MoveBehavior();
    private SkillAttack skillAttack = new SkillAttack();
    private Skilled skilled = new Skilled();
    private Skill skill = new TestSkill();
    private int power;
    private int attackRange;



    public Hero(String tName, int health, TeamEnum team, int armor, int magicArmor, int power, int attackRange) {
        super(tName, health, team, armor, magicArmor);
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
    public void skillInit(Skilledable skilledable) {
        skillAttack.skillAttack(skill.getSkillPower(),skilledable);
    }

    @Override
    public Skill getSkill() {
        return skill;
    }

    @Override
    public void skilled(int power) {
        skilled.skilled(power, this);
    }

    @Override
    public void revive() {
        setState(true);
        System.out.println(this + "살아남");
        setHealth(getMaxHealth());
    }

    @Override
    public void dead() {
        super.dead();
        RevivableManager.getInstance().addDeadRevivable(this);
    }

    public void goHome() {

    }

    public void setAttack(Attack attack) {
        this.attack = attack;
    }

    public void setSkill(Skill skill) {
        this.skill = skill;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public void setAttackRange(int attackRange) {
        this.attackRange = attackRange;
    }
}


