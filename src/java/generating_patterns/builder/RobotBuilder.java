package builder;

public class RobotBuilder  {
    private String name;
    private int age;

   RobotBuilder buildName(String name){
        this.name = name;
        return this;
   }
   RobotBuilder buildAge(int age){
        this.age = age;
        return this;
   }
   Robot build(){
       Robot robot = new Robot();
       robot.setName(name);
       robot.setAge(age);
       return robot;

   }
}
