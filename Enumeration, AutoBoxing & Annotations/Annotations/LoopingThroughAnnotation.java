import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface Loop
{
    int times() default 1;
}

public class LoopingThroughAnnotation
{
    static LoopingThroughAnnotation LTA = new LoopingThroughAnnotation();

    @Loop(times = 10)
    public void Implementing(String name) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException
    {
        System.out.println(name);
    }
    public static void main(String[] args) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException
    {
        System.out.println("---\"Looping Through Annotation At runtime\"---");
        Method[] m = LTA.getClass().getMethods();
        for(Method x:m)
        {
            if(x.isAnnotationPresent(Loop.class))
            {
                //creating Refernce variable
                Loop anno = x.getAnnotation(Loop.class);

                for(int i = 0;i<anno.times();i++)
                {
                    x.invoke(LTA,"Inayath");
                }
            }
        }
    }
}