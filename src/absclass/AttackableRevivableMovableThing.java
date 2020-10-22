package absclass;

import inter.Movable;

public abstract class AttackableRevivableMovableThing extends AttackableRevivableThing implements Movable {

    public AttackableRevivableMovableThing(String tName, int health, TeamEnum team, int armor, int magicArmor, int power, int attackRange, int x, int y) {
        super(tName, health, team, armor, magicArmor, power, attackRange, x, y);
    }

    @Override
    public void move(int direction) {
        System.out.println("x : " +this.getX() + "y : " +this.getY());
        switch (direction) {
            case 1:
                this.setX(this.getX() - 1);
                this.setX(this.getY() - 1);
                break;
            case 2:
                this.setY(this.getY() - 1);
                break;
            case 3:
                this.setX(this.getX() + 1);
                this.setY(this.getY() - 1);
                break;
            case 4:
                this.setX(this.getX() - 1);
                break;
            case 6:
                this.setX(this.getX() + 1);
                break;
            case 7:
                this.setX(this.getX() - 1);
                this.setY(this.getY() + 1);
                break;
            case 8:
                this.setX(this.getY() + 1);
                break;
            case 9:
                this.setX(this.getX() + 1);
                this.setY(this.getY() + 1);
                break;
        }
    }
}
