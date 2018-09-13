package prototype;

public class HumanMain {
    public static void main(String[] args) {
        Human human = new Human("Alexander","Denisenko",27,"man");
        System.out.println(human);
        System.out.println("----------------------------------------------------------------");
        HumanFactory humanFactory = new HumanFactory(human);
        Human humanClone = humanFactory.cloneHuman();
        System.out.println(humanClone);
    }
}
