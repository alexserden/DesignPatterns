package decorator;

public class Task {
    public static void main(String[] args) {
        Army army = new General(new Colonel(new Major()));
        System.out.println(army.giveCommand());
    }
}
