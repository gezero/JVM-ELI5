package cz.peinlich.eli5.jdk7;

/** simple enum to switch on */
enum TestEnum {
    ONE, TWO, THREE
}

/**
 * this class is showing that in JVM 7 you can switch on enum constant
 * <p/>
 * source: http://www.root.cz/clanky/novinky-v-nbsp-jdk-7-aneb-mirny-pokrok-v-nbsp-mezich-zakona-1/
 *
 * @see <a href="http://www.root.cz/clanky/novinky-v-nbsp-jdk-7-aneb-mirny-pokrok-v-nbsp-mezich-zakona-1">root.cz</a>
 */
public class EnumSwitchTest {
    public static void main(String args[]) {
        TestEnum x = TestEnum.TWO;
        int y;
        switch (x) {
            case ONE:
                y = 1;
                break;
            case TWO:
                y = 2;
                break;
            case THREE:
                y = 3;
                break;
            default:
                y = 0;
                break;
        }
        System.out.println(y);
    }
}