package Bridge;

public class Remote {
    Device device;

    public int setVolume(int volume) {
        device.setVolume(volume);
        return device.getVolume();
    }


    public int ChanelDown(int chanel) {
        device.setChanel(chanel);
        return device.getChanel();
    }

}
