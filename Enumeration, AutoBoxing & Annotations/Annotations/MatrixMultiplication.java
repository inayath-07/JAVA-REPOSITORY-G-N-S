import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Method;
import java.util.Scanner;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface MatrixMultiplication
{
}

class MatrixMultiplicationClass
{
    static int matrix[][] = new int[5][5];
    static int matrix2[][] = new int[5][5];
    static int matrixr[][] = new int[5][5];

    static Scanner in = new Scanner(System.in);

    @MatrixMultiplication
    public static void main(String...args)
    {
        System.out.println("MatrixMultiplicationClass.main()");
        MatrixMultiplicationClass MMC = new MatrixMultiplicationClass();
        Method[] m = MMC.getClass().getDeclaredMethods();

        for(Method x:m)
        {
            if(x.isAnnotationPresent(MatrixMultiplication.class))
            {
               
            }
        }
    }
}