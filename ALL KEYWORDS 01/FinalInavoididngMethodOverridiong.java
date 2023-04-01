class NoOverriding
{
    final void NoOverridingMethod()
    {
        System.out.println("no one can override me");
    }
}

public class FinalInavoididngMethodOverridiong extends NoOverriding
{
    /*
     * error
     * 
     * @Overrride
     * void NoOverridingMethod()
     * {
     * }
     */
    public static void main(String[] args)
    {
        System.out.println("FinalInavoididngMethodOverridiong.main()");

        NoOverriding NO = new NoOverriding();
        NO.NoOverridingMethod();
    }
}