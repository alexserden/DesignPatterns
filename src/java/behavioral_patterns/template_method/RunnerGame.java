package template_method;

public class RunnerGame {
    public static void main(String[] args) {
        Game game = new Basketball();
        game.play();
        System.out.println();
        game = new Boxing();
        game.play();
    }
}
