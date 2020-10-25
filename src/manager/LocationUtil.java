package manager;

import absclass.TeamEnum;
import absclass.Thing;
import defaultThing.SuppressTower;
import defaultThing.TurretTower;
import org.apache.commons.lang3.tuple.Pair;

public class LocationUtil {

    public static Pair<Integer,Integer> getBaseLocation(TeamEnum teamEnum, Class<?> clz) {
        switch (teamEnum) {
            case RED:
                return getBaseLocationOfRed(clz);
            case BLUE:
                return getBaseLocationOfBlue(clz);
            case NEUTRAL:
                return getBaseLocationOfNeutral(clz);
        }
        return null;
    }

    private static Pair<Integer,Integer> getBaseLocationOfRed(Class<?> clz) {
        if (clz == SuppressTower.class) {
            return Pair.of(5,3);
        } else if(clz == TurretTower.class) {
            return  Pair.of(7,3);
        }
        return Pair.of(3,3);
    }


    private static Pair<Integer,Integer> getBaseLocationOfBlue(Class<?> clz) {
        if (clz == SuppressTower.class) {
            return Pair.of(15,3);
        } else if(clz == TurretTower.class) {
            return  Pair.of(13,3);
        }
        return Pair.of(17,3);
    }

    private static Pair<Integer,Integer> getBaseLocationOfNeutral(Class<?> clz) {
        if (clz == SuppressTower.class) {
            return Pair.of(15,3);
        } else if(clz == TurretTower.class) {
            return  Pair.of(13,3);
        }
        return Pair.of(17,3);
    }
}
