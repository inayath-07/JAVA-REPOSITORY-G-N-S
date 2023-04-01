import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;

class ReflectionOfMatrix
{
    @SuppressWarnings("unused")
    private void Transpose()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("enter your matrix");
        int matrix[][] = new int[3][3];

        for(int i = 0;i<matrix.length;i++)
        {
            for(int j = 0;j<matrix.length;j++)
            {
                matrix[i][j] = in.nextInt();
            }
        }

        System.out.println("---- The transpose matrix is ----");
        for (int i = 0; i < matrix.length; i++)
        {
            for (int j = 0; j < matrix.length; j++)
            {
                System.out.print(matrix[j][i]+"\t");                
            }
            System.out.println();
        }
        in.close();
    }
}
public class MatrixTranspose
{
    public static void main(String[] args) throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException
    {
        System.out.println("---\"MatrixTranspose.main()\"---");

        //creating object of ReflectionOfMatrix
        ReflectionOfMatrix ROM = new ReflectionOfMatrix();

        //Reflection begans
        Method[] m = ROM.getClass().getDeclaredMethods();
        for(Method x:m)
        {
            x.setAccessible(true);
            if(x.getName().equals("Transpose"))
            {
                x.invoke(ROM);
            }
        }
    }    
}