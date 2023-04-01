//program to demonstrate Use of static with block
class TheNonStaticAccess
{
    static
    {
        System.out.println("hello");
    }
    void hello()
    {}
}

public class StaticBlock
{
    static
    {
        System.out.println("---\"StaticKeyword03.main\"---");
    }
    public static void main(String[] args)
    {
        System.out.println("The confusion");
        TheNonStaticAccess TNSA= new TheNonStaticAccess();
        TNSA.hello();
    }
}