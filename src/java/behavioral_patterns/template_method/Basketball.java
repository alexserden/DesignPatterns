package template_method;

public class Basketball extends Game{
    @Override
    void startPlay() {
        System.out.println("Basketball play ...");
    }

    @Override
    void endPlay() {
        System.out.println("Basketball end ...");

    }
}
