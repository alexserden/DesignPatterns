package builder;

public class Client {
    public static void main(String[] args) {
       Robot robot = new RobotBuilder().buildName("Robot").buildAge(27).build();
        System.out.println(robot.getName()+" "+robot.getAge());

    }
}
