package action.skilled;

import basicClass.Thing;

public class Skilled {

    public void skilled(int power, Thing thing){
        //TODO 우선 thing의 attacked로 놓고 나중에 스킬당하는거 구현, 데미지받음, 회복, 공격력 증가 등등
        thing.attacked(power);
    }

}
