class SuperConstructorDemonstration
{
    SuperConstructorDemonstration()
    {
        System.out.println("SuperConstructorDemonstration.SuperConstructorDemonstration()");
    }
}
public class SuperConstructor extends SuperConstructorDemonstration
{
    SuperConstructor()
    {
        super();
    }
    public static void main(String[] args)
    {
        System.out.println("---\"SuperConstructor.main()\"---");
        @SuppressWarnings("unused")
        SuperConstructor SC = new SuperConstructor();
    }
}