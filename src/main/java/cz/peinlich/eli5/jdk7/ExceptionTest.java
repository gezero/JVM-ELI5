package cz.peinlich.eli5.jdk7;

import java.util.List;
import java.util.ArrayList;

public class ExceptionTest
{
    public static List<String> log = new ArrayList<>();

    public static void main(String[] args)
    {
        try
        {
            int i = Integer.parseInt(args[0]);
            System.out.format("1000 / %d = %d\n", i, 1000/i);
        }
        catch (final IndexOutOfBoundsException | NumberFormatException e)
        {
            System.err.println("You need to enter number as a first argument to the program");
            log.add(e.toString());
        }
        catch (ArithmeticException e)
        {
            System.err.println("Dividing by zero!");
            log.add(e.toString());
        }
        finally
        {
            System.out.println("\nError log: ");
            for (String str : log)
            {
                System.out.println(str);
            }
        }
    }
}