package Bridge;

public class Client {
    public static void main(String[] args) {
         Device device = new TV();
         device.setChanel(5);
         device.setVolume(48);
        System.out.println("chanel "+device.getChanel());
        System.out.println("volume "+device.getVolume());
    }
}
