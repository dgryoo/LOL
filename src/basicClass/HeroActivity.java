package basicClass;

import java.util.Arrays;

public enum HeroActivity {

    ATTACK(1, "공격"),
    SKILL(2, "스킬사용"),
    MOVE(3, "이동"),
    GOHOME(4, "귀환"),
    NONE(100, "NONE");


    int num;
    String option;

    HeroActivity(int num, String option) {
        this.num = num;
        this.option = option;
    }

    public int getNum() {
        return num;
    }

    public String getOption() {
        return option;
    }

    public static HeroActivity valueOf(int value) {
        return Arrays.stream(HeroActivity.values())
                .filter(heroActivity -> heroActivity.getNum() == value)
                .findFirst()
                .orElse(NONE);
//            for (HeroActivity heroActivity : HeroActivity.values()) {
//                if (heroActivity.getNum() == value) {
//                    return heroActivity;
//                }
//            }
//            return NONE;
    }



}
