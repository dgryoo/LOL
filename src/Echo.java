public class Echo extends Hero {

    public Echo(Team team) {
        super("Echo", 200, team, 20, 15, 10, 10);

    }


    @Override
    public void skill() {
        System.out.println( getTeam() + "팀의 " + gettName() +  "이 skill 사용");
    }

    @Override
    public void ultimateSkill() {
        System.out.println("ultimateSkill 사용");
    }
}
