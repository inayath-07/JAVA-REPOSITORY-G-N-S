final class IcannotExtends
{
    IcannotExtends()
    {
        System.out.println("final is not allowing to inherit");
    }
}

public class FinalInovidingInheritance //extends IcannotExtends --> error
{
    public static void main(String[] args)
    {
        System.out.println("---\"FinalInovidingInheritance.main()\"---");
        
        @SuppressWarnings("unused")
        IcannotExtends ICE = new IcannotExtends();
    }
}