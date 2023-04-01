import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class TheFieldContanier
{
    private String name = "inayath";

    //The methods
    public void getName()
    {
        System.out.println(name);
    }
}
public class AccessingFields
{
    public static void main(String[] args) throws NoSuchMethodException, SecurityException, IllegalArgumentException, IllegalAccessException, InvocationTargetException
    {
        System.out.println("---\"Accessing Fields \"---");

        //the object of TheFieldContanier
        TheFieldContanier TFC = new TheFieldContanier();

        //Creating The Reflector
        Field[] f = TFC.getClass().getDeclaredFields();
        Method[] m = TFC.getClass().getDeclaredMethods();

        for(Field x:f)
        {
            x.setAccessible(true);
            x.set(TFC,"SYED SHAH INAYATH ULLAH QUADRI");
        }
        for(Method x:m)
        {
            x.setAccessible(true);
            x.invoke(TFC);
        }
    }
}