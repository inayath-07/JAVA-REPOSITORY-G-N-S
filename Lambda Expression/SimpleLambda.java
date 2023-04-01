@FunctionalInterface
interface Lambda
{
    void hello();
}
public class SimpleLambda
{
    public static void main(String[] args)
    {
        System.out.println("---\"SimpleLambda.main()\"---");
        Lambda L = ()->
        {
            System.out.println("Asalamualaikum");
        };
        L.hello();
    }
}