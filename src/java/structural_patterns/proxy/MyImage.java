package proxy;

public class MyImage implements Image {
    private String fileName;

    public MyImage(String fileName) {
        this.fileName = fileName;
        loadFromInternet(fileName);
    }

    @Override
    public void display() {
        System.out.println("Display "+fileName);
    }
    public void loadFromInternet(String name){
        System.out.println(fileName+" File Loading ...");

    }
}
