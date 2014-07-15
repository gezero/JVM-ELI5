package cz.peinlich.eli5.jdk7;

/**
 * This class is showing how to newly write numeric constants in jdk7
 * <p/>
 * source: http://www.root.cz/clanky/novinky-v-nbsp-jdk-7-aneb-mirny-pokrok-v-nbsp-mezich-zakona-1/
 *
 * @see <a href="http://www.root.cz/clanky/novinky-v-nbsp-jdk-7-aneb-mirny-pokrok-v-nbsp-mezich-zakona-1">root.cz</a>
 */
public class NumericConstants {
    public static void main(String[] args) {
        int decimal1 = 1234567890;
        int decimal2 = 1_234_567_890; // separating thousands
        long decimal3 = -99_88_77_66_55_44_33_22_11L;

        // binary
        int binary1 = 0b01000010;
        long binary2 = 0b0000_0001_0010_0011_0100_0101;

        // negative binary...
        long binary3 = -0b0000_0001_0010_0011_0100_0101;

        //octal
        int octal1 = 01234567;
        int octal2 = 012_34_56_77;
        long octal3 = 0666_555_444_333_222_111L;

        //hexa
        int hexadecimal1 = 0x12345678;
        int hexadecimal2 = 0x12_34_56_78;
        long hexadecimal3 = 0x88_77_66_55_44_33_22_11L;

        // floats can use underscores
        float f1 = -1_2.3_4f;
        double f2 = -1_2.3_4e10;
        double f3 = -1_2.3_4e1_2_3;

        System.out.println(decimal1);
        System.out.println(decimal2);
        System.out.println(decimal3);
        System.out.println();

        System.out.format("%x\n", binary1);
        System.out.format("%x\n", binary2);
        System.out.format("%x\n", binary3);
        System.out.println();

        System.out.format("%o\n", octal1);
        System.out.format("%o\n", octal2);
        System.out.format("%o\n", octal3);
        System.out.println();

        System.out.format("%x\n", hexadecimal1);
        System.out.format("%x\n", hexadecimal2);
        System.out.format("%x\n", hexadecimal3);
        System.out.println();

        System.out.println(f1);
        System.out.println(f2);
        System.out.println(f3);
    }
}