package cz.peinlich.eli5.jdk7.cz.peinlich.eli5.gc;

import java.util.ArrayList;
import java.util.List;

/**
 * Items will be garbage collected. Note that we override the finalize method
 */
class Item1 {
    private int i;

    public Item1(int i) {
        this.i = i;
    }

    @Override
    protected void finalize() {
        System.out.println("finalize object #" + this.i);
    }
}

/**
 * This class shows how the garbage collection could be explicitly called.
 * Note that the order of the objects is not preserved when the program runs
 * <p/>
 * source: http://www.root.cz/clanky/monitorovani-procesu-a-sprava-pameti-v-jdk6-a-jdk7-1/
 * <p/>
 * try to run the program with vm parameter -verbose:gc to see gc output
 */
public class GCTest1 {
    public static void main(String[] args) {
        List<Item1> list = new ArrayList<Item1>();
        for (int i = 0; i < 20; i++) {
            list.add(new Item1(i));
        }
        System.out.println("Before garbage collection");
        list = null; //this is needed to mark objects for garbage collection
        System.gc();
        System.out.println("Before finalization");
        System.runFinalization();
        System.out.println("Before end");
    }
}