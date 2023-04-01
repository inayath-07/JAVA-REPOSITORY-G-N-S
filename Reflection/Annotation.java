import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface Annotator
{
    int time() default 1;
}

class Repetation
{
    @Annotator(time = 556415210)
    public void Repeate()
    {
        System.out.println("Syed Shah Inayath Ullah Quadri");
    }

}
public class Annotation
{
    public static void main(String[] args) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException
    {
        System.out.println("---\"Annotation Through reflection\"---");
        Repetation R = new Repetation();

        
        Method[] m = R.getClass().getDeclaredMethods();
        for(Method x:m)
        {
            Annotator annotation = x.getAnnotation(Annotator.class);
            if(x.isAnnotationPresent(Annotator.class))
            {
                for(int i = 0;i <annotation.time();i++)
                {
                    System.out.print((i+1)+".");
                    x.invoke(R);
                }
            }
        }
    }
}