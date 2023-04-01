import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Method;

/*The Program on UserDefine Ovverriden */

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface UDOverride
{}

class Scince1970
{
    void currentTimeMilli()
    {
        long time = System.currentTimeMillis();

        System.out.println("The Current MilliSecond science 1970 "+time);
        System.out.println("The Current Second scince 1970 "+time/1000);
        System.out.println("The Current miniute scince 1970 "+time/1000/60);
        System.out.println("The Current hourse scince 1970 "+time/1000/60/60);
        System.out.println("The Current Days scince 1970 "+time/1000/60/60/24);
        System.out.println("The Current years scince 1970 "+time/1000/60/60/24/365);
    }
}

class Scince1980 extends Scince1970
{
    @UDOverride
    void currentTimeMilli()
    {
        double tenmilli = 10*3.156e+10; //multiply time with 3.156e+10
        double time = System.currentTimeMillis()+tenmilli;

        System.out.println("The number of years scince 1980 "+(int)(time/1000/60/60/24/365-20));
    }
}

public class TheOverridingAnnotation
{
    public static void main(String[] args) throws Exception
    {
        System.out.println("---\"The Overriding Annotation\"---");

        Scince1980 s80 = new Scince1980();
        String m = s80.getClass().getSuperclass().getDeclaredMethod("currentTimeMilli").getName();
        String m1 = s80.getClass().getDeclaredMethod("currentTimeMilli").getName();

        if(m.equals(m1))
        {
            for(Method x:s80.getClass().getDeclaredMethods())
            {
                for(Method x1 : s80.getClass().getSuperclass().getDeclaredMethods())
                {
                    if(x.getParameterCount() == x1.getParameterCount())
                    {
                        System.out.println("The method can be overriden");
                        x.invoke(s80);
                    }
                    else
                    {
                        throw new Exception("Method cannot be overriden");
                    }
                }
            }
        }
    }
}