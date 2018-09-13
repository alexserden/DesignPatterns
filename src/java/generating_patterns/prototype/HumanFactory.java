package prototype;

public class HumanFactory {
   private Human human;

    public HumanFactory(Human human) {
        this.human = human;
    }
   public Human cloneHuman(){
       return (Human) human.copy();
    }
}
