package Adapter;

public class ListAdapter implements SecondList {
    FirstList firstList;

    public ListAdapter(FirstList firstList) {
        this.firstList = firstList;
    }

    @Override
    public int getValue(int index) {
        return firstList.get(index);
    }

    @Override
    public void setValue(int index, int value) {
       this.firstList.set(index,value);
    }

    @Override
    public int getSize() {
        return firstList.size();
    }

}
