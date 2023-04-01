import java.lang.reflect.Method;

@FunctionalInterface
interface UsingThis
{
    Method ReturningConstructor();
}

class a{
void hello()
{
    System.out.println("skdl");
    this.hello();
}
}
public class ReturnTypeLambdaAndThis
{
    public static void main(String[] args)
    {
        System.out.println("---\"ReturnTypeLambdaAndThis.main()\"---");

        //declaration of variable
        //int i = 1;
        // UsingThis UT = ()->
        // {
        //     System.out.println(i+"aslamualaikum");
        //     return ReturningConstructor.this();
        // };
        a o = new a();
        o.hello();
    }
}