package cz.peinlich.eli5.allocation;

/**
 * This class shows speed of creating and destruction of object when using simple string concatenation.
 * <p/>
 * source: http://www.root.cz/clanky/monitorovani-procesu-a-sprava-pameti-v-jdk6-a-jdk7-1/
 */
public class ConcatenationTest1 {
    public static final int LOOP_COUNT = 100000;

    private static String createString() {
        String str = "";
        for (int i = 0; i < LOOP_COUNT; i++) {
            str += i + " ";
        }
        return str;
    }

    public static void main(String[] args) {
        String str = createString();
        System.out.println("String length: " + str.length());
        System.out.println("*** Running full gc ***");
        System.gc();
        System.runFinalization();
        System.out.println("*** Quitting ***");
    }
}