package action.move.moves;

import basicClass.Thing;

public class MoveBehavior {

    public void moveUnit(Thing thing, int direction) {
        System.out.print(thing.getX() + "," + thing.getY()+ " ->");
        switch (direction) {
            case 1:
                thing.setX(thing.getX() - 1);
                thing.setX(thing.getY() - 1);
                break;
            case 2:
                thing.setY(thing.getY() - 1);
                break;
            case 3:
                thing.setX(thing.getX() + 1);
                thing.setY(thing.getY() - 1);
                break;
            case 4:
                thing.setX(thing.getX() - 1);
                break;
            case 6:
                thing.setX(thing.getX() + 1);
                break;
            case 7:
                thing.setX(thing.getX() - 1);
                thing.setY(thing.getY() + 1);
                break;
            case 8:
                thing.setX(thing.getY() + 1);
                break;
            case 9:
                thing.setX(thing.getX() + 1);
                thing.setY(thing.getY() + 1);
                break;
        }
        System.out.println(thing.getX() + "," + thing.getY());
    }

}
