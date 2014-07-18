package cz.peinlich.eli5.jdk7;


/**
 * Here we implement the AutoCloseable interface
 */
class TestClass implements java.lang.AutoCloseable
{
    private String name;

    public TestClass(String name)
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
        System.out.println(name + " -> close()");
    }
}

/**
 * This class shows calling of close methods when using the AutoCloseable interface.
 *
 * source: http://www.root.cz/clanky/novinky-v-nbsp-jdk-7-aneb-mirny-pokrok-v-nbsp-mezich-zakona-2
 */
public class AutoCloseableTest
{
    public static void main(String[] args)
    {
        try (
                TestClass t1 = new TestClass("T1");
                TestClass t2 = new TestClass("T2");
                TestClass t3 = new TestClass("T3")
        )
        {
            System.out.println("zacatek bloku try");
            int i = Integer.parseInt(args[0]);
            t1.doSomething();
            t2.doSomething();
            t3.doSomething();
            System.out.println("konec bloku try");
        }
        catch (RuntimeException e)
        {
            e.printStackTrace();
        }
        finally
        {
            System.out.println("blok finally");
        }
    }
}