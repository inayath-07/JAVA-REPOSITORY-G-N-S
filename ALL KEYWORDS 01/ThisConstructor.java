//program to demnostratre invoking constructor usin This keyword
class SayHello
{
    SayHello(Integer a)
    {
        this(); //this only work in constructor & should be the first statement in constructor
        System.out.println("The protectiondomain of "+a+" is "+a.getClass().getProtectionDomain());
    }
    SayHello()
    {
        System.out.println("hello");
    }
}
public class ThisConstructor
{
    public static void main(String[] args)
    {
        System.out.println("---\"ThisKeyword02.main()\"---");

        @SuppressWarnings("unused")
        SayHello SH = new SayHello(10);
    }
}