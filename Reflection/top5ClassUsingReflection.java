import java.lang.reflect.Field;
import java.lang.reflect.Method;

@SuppressWarnings("unused")
class TheMethods
{
    //The methods with different access modifier
    public void laptopName()
    {
        System.out.println("The laptop name is Lenove");
    }
    private void noLeak()
    {
        System.out.println("The secrate message is Inayath");
    }
    protected void name()
    {
        System.out.println("The name is syed shah inayath ");
    }
    void carName()
    {
        System.out.println("Tesla ");
    }

    //declaraing fields 
    private double pi = Math.PI;
    private double e = Math.E;
    public String name = "Sysed shah inayath ullah quadri";
    public int num = 20;
}
public class top5ClassUsingReflection
{
    /**
     * @param args
     * @throws NoSuchFieldException -- In this program it is used by
     * getField() to throw exception or error if the field is not present
     * 
     * @throws SecurityException -- it is used when breaking of security or violation
     * of security occurs
     * @throws NoSuchMethodException -- it si similar to NoSuchFieldException
     * just in place of field it is method
     */
    public static void main(String[] args) throws NoSuchFieldException, SecurityException, NoSuchMethodException
    
    {
        System.out.println("---\"Top 5 classes of Reflection class\"---");
        
        //creating object of TheMethods class
        TheMethods TM = new TheMethods();

        //The reflection begans 

        Field[] f = TM.getClass().getFields(); //used to access only public fields
        Field f1 = TM.getClass().getField("num"); //used to access particular publiec field
        Field f2 = TM.getClass().getDeclaredField("e");//used to access particular field
        Field[] f3 = TM.getClass().getDeclaredFields(); //used to access any kind of multiple fields


        for(Field x:f)
        {
            System.out.println(x.getName());
        }

        System.out.println("------------------------");

        for(Field x:f3)
        {
            System.out.println(x.getName());
        }

        System.out.println("------------------------");

        System.out.println(f2.getType());
        System.out.println(f2.getGenericType());

        System.out.println("------------------------");
        
        System.out.println(f1.getType());
        System.out.println(f1.getGenericType());


        //The methods
        Method[] m = TM.getClass().getMethods(); //used to access only public fields
        Method m1 = TM.getClass().getMethod("num"); //used to access particular publiec field
        Method m2 = TM.getClass().getDeclaredMethod("e");//used to access particular field
        Method[] m3 = TM.getClass().getDeclaredMethods(); //used to access any kind of multiple fields

        for(Method x:m)
        {
            System.out.println(x.getName());
        }

        System.out.println("------------------------");

        for(Method x:m3)
        {
            System.out.println(x.getName());
        }

        System.out.println("------------------------");

        System.out.println(m2.getReturnType());
        System.out.println(m2.getGenericReturnType());

        System.out.println("------------------------");
        
        System.out.println(m1.getReturnType());
        System.out.println(m1.getGenericExceptionTypes());
    }
}