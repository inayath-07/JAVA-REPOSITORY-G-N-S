interface HI
{
    void sayHello();
}

class English implements HI
{
    public void sayHello()
    {
        System.out.println("hello");
    }
}

class Arabic implements HI
{
    public void sayHello()
    {
        System.out.println("Asalamualaikum");
    }
}

public class HiraricalInheritanceInInterface
{
    public static void main(String[] args)
    {
        System.out.println("---\"InheritanceInInterface.main()\"---");
        English E = new English();
        E.sayHello();

        Arabic A = new Arabic();
        A.sayHello();
    }
}