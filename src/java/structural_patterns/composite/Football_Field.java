package composite;

public class Football_Field {
    public static void main(String[] args) throws InterruptedException {
        Team team = new Team();

        FootBaller goalkeeperFootBaller = new GoalkeeperFootBaller();
        FootBaller defenderFootBaller = new DefenderFootBaller();
        FootBaller midfielderFootBaller = new MidfielderFootBaller();
        FootBaller forwardFootBaller = new ForwardFootBaller();

        team.addFootBaller(goalkeeperFootBaller);
        team.addFootBaller(defenderFootBaller);
        team.addFootBaller(midfielderFootBaller);
        team.addFootBaller(forwardFootBaller);

        team.playFootball();
    }
}
