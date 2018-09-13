package proxy;

public class ProxyRunner {
    public static void main(String[] args) {
        Image image = new ProxyImage("https://www.alexserden.com");
        image.display();
        System.out.println("-------------------------------------");
        image.display();
    }
}
