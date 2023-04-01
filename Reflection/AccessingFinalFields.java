import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class TheFinalReflection
{
    private final double pi;

    TheFinalReflection(double pi)
    {
        this.pi = pi;
    }


    //The getter
    public double getPi()
    {return pi;}
}
public class AccessingFinalFields
{
    public static void main(String[] args) throws NoSuchFieldException, SecurityException, NoSuchMethodException, IllegalArgumentException, IllegalAccessException, InvocationTargetException
    {
        System.out.println("---\"Accessing Advanced Fields\"---");

        TheFinalReflection TFR = new TheFinalReflection(Math.PI);

        //Reflection begangs
        Field[] f = TFR.getClass().getDeclaredFields();
        Method[] m = TFR.getClass().getDeclaredMethods();

        //The real Process began for Fields
        for(Field x:f)
        {
            if(x.getName().equals("pi"))
            x.setAccessible(true);
            x.set(TFR,0.25);
        }

        //The real Process began for Methods
        for(Method x:m)
        {
            if(x.getName().equals("getPi"))
            {
                x.setAccessible(true);
                System.out.println(x.invoke(TFR));
            }
        }

    }    
}