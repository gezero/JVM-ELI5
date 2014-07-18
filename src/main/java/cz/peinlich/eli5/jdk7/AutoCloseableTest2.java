package cz.peinlich.eli5.jdk7;

/**
 * Here we implement the AutoCloseable interface
 */
class TestClass2 implements java.lang.AutoCloseable
{
    private String name;

    public TestClass2(String name)
    {
        this.name = name;
        System.out.println(name + " -> constructor()");
    }

    public void doSomething()
    {
        System.out.println(name + " -> doSomething()");
    }

    public void close()
    {
        if ("T2".equals(this.name))
        {
            throw new RuntimeException("T2 object throws exception!");
        }
        if ("T3".equals(this.name))
        {
            throw new RuntimeException("T3 object throws exception!");
        }
        System.out.println(name + " -> close()");
    }
}

/**
 * This class shows calling of close methods when using the AutoCloseable interface as well as showing the suppression
 * of exceptions thrown in the close methods.
 *
 * source: http://www.root.cz/clanky/novinky-v-nbsp-jdk-7-aneb-mirny-pokrok-v-nbsp-mezich-zakona-2
 */

public class AutoCloseableTest2
{
    public static void main(String[] args)
    {
        try (
                TestClass2 t1 = new TestClass2("T1");
                TestClass2 t2 = new TestClass2("T2");
                TestClass2 t3 = new TestClass2("T3");
                TestClass2 t4 = new TestClass2("T4")
        )
        {
            System.out.println("beginning of try block");
            int i = Integer.parseInt(args[0]);
            t1.doSomething();
            t2.doSomething();
            t3.doSomething();
            t4.doSomething();
            System.out.println("end of try block");
        }
        catch (RuntimeException e)
        {
            e.printStackTrace();
        }
        finally
        {
            System.out.println("finally block");
        }
    }
}