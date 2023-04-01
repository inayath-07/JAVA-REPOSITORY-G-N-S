import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class TheRuleBreaker
{
    //The basic private final fields
    private final String name;

    TheRuleBreaker(String name)
    {this.name = name;}

    @SuppressWarnings("unused")
    private String getName()
    {return name;}
}
public class AccessingPrivateFields
{
    public static void main(String...args) throws IllegalArgumentException, IllegalAccessException, InvocationTargetException
    {
        System.out.println("---\"Acessing multiple pirvate fields \"---");
        TheRuleBreaker TRB = new TheRuleBreaker("inayath");

        //The Reflection Begans
        Field[] f = TRB.getClass().getDeclaredFields();
        Method[] m = TRB.getClass().getDeclaredMethods();

        //The code for private final members access
        for(Field x : f)
        {
            x.setAccessible(true);
            if(x.getName().equals("name"))
            {
                x.set(TRB,"Syed shah inayath ullah quadri");
            }
        }

        for(Method x:m)
        {
            x.setAccessible(true);

            if(x.getName().equals("getName"))
            {
                String name = (String)x.invoke(TRB);
                System.out.println("The Changed value is "+name);
            }
        }
    }
}