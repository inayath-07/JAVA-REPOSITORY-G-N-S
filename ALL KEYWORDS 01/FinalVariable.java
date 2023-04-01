import static java.lang.Math.PI;

public class FinalVariable
{
    public static void main(String[] args)
    {
        System.out.println("---\"FinalVariable.main()\"---");

        final double pi = PI;
        System.out.println(pi);

        /*
            pi = 2;
        */
    }    
}