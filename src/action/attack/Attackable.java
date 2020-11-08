package action.attack;


import basicClass.Thing;

public interface Attackable {

    void attackinit(Thing thing);

    boolean isAttack(Thing thing);

}
