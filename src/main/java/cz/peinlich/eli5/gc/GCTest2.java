package cz.peinlich.eli5.gc;

import java.util.ArrayList;
import java.util.List;

class Item2 {
    private int i;

    public Item2(int i) {
        this.i = i;
    }

    @Override
    protected void finalize() {
        System.out.println("finalize object #" + this.i);
    }
}

/**
 * This class removes objects one by one and runs the gc each time.
 * <p/>
 * source: http://www.root.cz/clanky/monitorovani-procesu-a-sprava-pameti-v-jdk6-a-jdk7-1/
 * <p/>
 * try to run the program with vm parameter -verbose:gc to see gc output
 */
public class GCTest2 {
    public static void main(String[] args) throws InterruptedException {
        List<Item2> list = new ArrayList<Item2>();
        for (int i = 0; i < 20; i++) {
            list.add(new Item2(i));
        }
        System.out.println("Going to run gc");
        while (!list.isEmpty()) {
            list.remove(0);
            System.gc();
            System.runFinalization();
            Thread.sleep(100);
        }
    }
}