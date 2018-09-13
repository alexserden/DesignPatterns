package Bridge;

public class TV implements Device{
     private  int chanel;
    private  int volume;

    @Override
    public int getVolume() {
        return volume;
    }

    @Override
    public void setVolume(int volume) {
       this.volume = volume;
    }

    @Override
    public int getChanel() {
        return chanel;
    }


    @Override
    public void setChanel(int chanel) {
        this.chanel = chanel;
        }
}
