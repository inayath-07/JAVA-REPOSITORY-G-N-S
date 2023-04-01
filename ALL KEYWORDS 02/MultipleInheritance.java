interface MI
{
    void method();
}

interface MI1
{
    void method1();
}

class Implementing implements MI,MI1
{

    @Override
    public void method1()
    {
        System.out.println("i am from MI 1");        
    }

    @Override
    public void method()
    {
        System.out.println("i am from MI");   
    }
}

public class MultipleInheritance
{
    public static void main(String[] args)
    {
        System.out.println("---\"MultipleInheritance.main()\"---");

        Implementing I =new Implementing();
        I.method();
        I.method1();
    }    
}