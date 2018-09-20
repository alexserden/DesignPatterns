package template_method;

public abstract class Game {
    abstract void startPlay();

    abstract void endPlay();

    //template method
    public final void play() {
        startPlay();
        endPlay();
    }
}
