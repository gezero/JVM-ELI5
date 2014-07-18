package cz.peinlich.eli5.allocation;

/**
 * This class shows speed of creating and destruction of object when using string builder but now using append chaining
 * <p/>
 * source: http://www.root.cz/clanky/monitorovani-procesu-a-sprava-pameti-v-jdk6-a-jdk7-1/
 */
public class ConcatenationTest3 {
    public static final int LOOP_COUNT = ConcatenationTest2.LOOP_COUNT * 10;

    private static String createString() {
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < LOOP_COUNT; i++) {
            str.append(i).append(" ");
        }
        return str.toString();
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