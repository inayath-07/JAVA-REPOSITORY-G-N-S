import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@interface VeryImportant
{}

@VeryImportant
public class VeryImportantAnnotation
{
    public static void main(String[] args)
    {
        System.out.println("---\"VeryImportant Annotation\"---");

        VeryImportantAnnotation VIA = new VeryImportantAnnotation();
        if(VIA.getClass().isAnnotationPresent(VeryImportant.class))
        {
            System.out.println("it is very Important");
        }
        else
        {
            System.out.println("lyt lo bhai");
        }
    }
}