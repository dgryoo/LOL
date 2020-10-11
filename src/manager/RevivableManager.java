package manager;

import inter.Revivable;

import java.util.ArrayList;
import java.util.List;

public final class RevivableManager {

    private static RevivableManager revivableManager = new RevivableManager();
    private List<DeadRevivable> deadRevivableList = new ArrayList();
    private final int turnToRevive = 3;

    public static RevivableManager getInstance() {
        return revivableManager;
    }

    public void checkToRevive() {
        /*deadRevivableList.forEach(deadRevivable -> {
            deadRevivable.increaseTurn();
            if (deadRevivable.turn == turnToRevive) {
                deadRevivable.revivable.revive();
                deadRevivableList.remove(deadRevivable); // will be error
            }
        });*/
        for (int i = 0; i < deadRevivableList.size(); i++) {
            DeadRevivable recent = deadRevivableList.get(i);
            recent.increaseTurn();
            if (recent.turn == turnToRevive) {
                recent.revivable.revive();
                deadRevivableList.remove(i);
                i--;
            }
        }

    }

    private class DeadRevivable {
        int turn;
        Revivable revivable;

        private DeadRevivable(Revivable revivable) {
            this.revivable = revivable;
        }

        private void increaseTurn () {
            turn++;
            System.out.println(turn + " : " + revivable );
        }

    }

    public void addDeadRevivable(Revivable revivable) {
        deadRevivableList.add(new DeadRevivable(revivable));
        System.out.println("옵저버등록" + revivable);
    }

}
