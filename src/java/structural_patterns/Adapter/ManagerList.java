package Adapter;

public class ManagerList {
    public static void main(String[] args) {
        FirstList firstList = createList();
        SecondList secondList = new ListAdapter(firstList);
    }

    public static FirstList createList(){
        return null;
    }
}
