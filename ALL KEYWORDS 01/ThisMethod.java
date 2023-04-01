//This program demonstrate invoking of Method using this keyword
class InvokingMethod
{
    void hello()
    {
        System.out.println("Hello");
    }

    void hello(int a )
    {
        for (int i = 0; i < a; i++)
        {
            System.out.println("hello");            
        }
    }

    void hi()
    {
        this.hello();
        this.hello(10);
        this.hi();
    }
}

public class ThisMethod
{
    public static void main(String[] args)
    {
        System.out.println("---\"ThisKeyword03.main()\"---");
        InvokingMethod IM = new InvokingMethod();

        IM.hi();
    }
}