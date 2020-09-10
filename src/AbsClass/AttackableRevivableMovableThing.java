package AbsClass;

import Inter.Movable;

public abstract class AttackableRevivableMovableThing extends AttackableRevivableThing implements Movable {

    public AttackableRevivableMovableThing(String tName, int health, Team team, int armor, int magicArmor, int power, int attackRange, int x, int y) {
        super(tName, health, team, armor, magicArmor, power, attackRange, x, y);
    }

    @Override
    public void move(int direction) {

        System.out.println("움직일 방향을 선택하세요");
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
