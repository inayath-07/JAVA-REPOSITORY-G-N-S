import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

class ConstructorClass
{
    ConstructorClass(int x)
    {
        System.out.println("the Cube Root of "+x+" is "+Math.cbrt(x));
    }
}
public class ClassAndConstructor
{
    public static void main(String[] args)throws IOException
    {
        InputStreamReader read = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(read);

        System.out.println("---\"Constructor and classes \"---");

        System.out.println("enter number to find its cbrt");
        int num = Integer.parseInt(in.readLine());

        ConstructorClass cClass = new ConstructorClass(num);

        System.out.println(cClass.getClass());
    }    
}