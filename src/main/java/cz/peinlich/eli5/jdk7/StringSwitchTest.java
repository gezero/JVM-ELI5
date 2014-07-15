package cz.peinlich.eli5.jdk7;

/**
 * This class is showing that string switch is working in jdk7
 * <p/>
 * source: http://www.root.cz/clanky/novinky-v-nbsp-jdk-7-aneb-mirny-pokrok-v-nbsp-mezich-zakona-1/
 *
 * @see <a href="http://www.root.cz/clanky/novinky-v-nbsp-jdk-7-aneb-mirny-pokrok-v-nbsp-mezich-zakona-1">root.cz</a>
 */
public class StringSwitchTest
{

    public static int getDaysOfMonth(String month)
    {
        int YEAR = 2010;
        switch (month)
        {
            case "April":
            case "June":
            case "September":
            case "November":
                return 30;
            case "January":
            case "March":
            case "May":
            case "July":
            case "August":
            case "October":
            case "December":
                return 31;
            case "February":
                return YEAR % 4 == 0 && (YEAR % 100 != 0 || YEAR % 400 == 0) ? 29 : 28;
            default:
                throw new RuntimeException("Unknown month name: " + month);
        }
    }

    public static void main(String[] args)
    {
        String[] months = {"January", "February", "March",
                "April",   "May",      "June",
                "July",    "August",   "September",
                "October", "November", "December"};

        for (String month : months)
        {
            int days = getDaysOfMonth(month);
            System.out.format("%-10s\t%d\n", month, days);
        }
    }
}