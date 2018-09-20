package iterator;

public class IteratorRunner {
    public static void main(String[] args) {
        String[] name = {"Piano", "Harmonic", "Guitar", "Violin"};

        Instrument instrument = new Instrument(name);

        Iterator iterator = instrument.getIterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
}
