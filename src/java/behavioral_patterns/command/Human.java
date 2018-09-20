package command;

public class Human {
   private Command bark;
   private Command sit;
   private Command lie;

    public Human(Command bark, Command sit, Command lie) {
        this.bark = bark;
        this.sit = sit;
        this.lie = lie;
    }
    public void bark(){
        bark.execute();
    }
    public void sit(){
        sit.execute();
    }
    public void lie(){
        lie.execute();
    }
}
