package cz.peinlich.eli5.jdk7;

import java.util.List;
import java.util.ArrayList;

/**
 * this class is showing the diamond operator in JVM 7.
 * <p/>
 * source: http://www.root.cz/clanky/novinky-v-nbsp-jdk-7-aneb-mirny-pokrok-v-nbsp-mezich-zakona-2
 *
 * @see <a href="http://www.root.cz/clanky/novinky-v-nbsp-jdk-7-aneb-mirny-pokrok-v-nbsp-mezich-zakona-2">root.cz</a>
 */

public class DiamondTest1
{
    public static void main(String[] args)
    {
        List<String> list = new ArrayList<>();
        list.add("Hello");
        list.add(null);
        list.add("World!");
        for (String str : list)
        {
            System.out.println(str);
        }
    }
}