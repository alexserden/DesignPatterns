package proxy;

public class ProxyImage implements Image {
    private MyImage myImage;
    private String fileName;

    public ProxyImage(String fileName){
        this.fileName = fileName;
    }

    @Override
    public void display() {
        if(myImage == null){
            myImage = new MyImage(fileName);
        }
        myImage.display();
    }
}
