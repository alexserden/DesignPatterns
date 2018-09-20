package template_method;

public class Boxing extends Game{
    @Override
    void startPlay() {
        System.out.println("Boxing play ...");

    }

    @Override
    void endPlay() {
        System.out.println("Boxing end ...");

    }
}
