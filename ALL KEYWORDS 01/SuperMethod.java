class SuperMethodDemonstration
{
    void SuperMethod()
    {
        System.out.println("i am super method of SuperMethodDemonstration");
    }
}

class ExtendingSMD extends SuperMethodDemonstration
{
    ExtendingSMD()
    {
        super.SuperMethod();
    }
}

public class SuperMethod
{
    public static void main(String[] args)
    {
        System.out.println("---\"SuperMethod.main()\"---");
        @SuppressWarnings("unused")
        ExtendingSMD ESMD = new ExtendingSMD();
    }
}