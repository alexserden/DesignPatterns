package iterator;

public class Instrument implements Collection {
    String [] names;

    public Instrument(String[] names) {
        this.names = names;
    }

    @Override
    public Iterator getIterator() {
        return new NameIterator();
    }

    class NameIterator implements Iterator{
        int index;

        @Override
        public boolean hasNext() {
            if(index < names.length) {
                return true;
            }
            return false;
        }

        @Override
        public Object next() {
            if(this.hasNext()) {
                return names[index++];
            }
            return null;
        }
    }

}
