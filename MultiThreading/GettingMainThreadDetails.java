import java.lang.reflect.Method;

public class GettingMainThreadDetails
{
    public static void main(String[] args)
    {
        System.out.println("---\"GettingThreadDetailsFromMain.main()\"---");
        GettingMainThreadDetails GTDFM = new GettingMainThreadDetails();
        Method[] m = GTDFM.getClass().getMethods();

        for(Method x:m)
        {
            System.out.println("\""+x.getName().toString().toUpperCase()+"\"");
        }
    }
}