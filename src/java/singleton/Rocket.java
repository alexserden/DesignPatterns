package singleton;

public class Rocket {
    private static Rocket rocket;

    private Rocket() {

    }

    public synchronized static Rocket getRocket() {
        if(rocket==null){ return rocket = new Rocket();}
        return rocket;
    }
}
