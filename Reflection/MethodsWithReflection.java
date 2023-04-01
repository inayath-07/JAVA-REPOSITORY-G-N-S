import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;

//following program demosntratre String function
class TheGameOfMultipleParametarizedMethod
{
    @SuppressWarnings("unused")
    private void TheGameOfMethod(String string,String string2)
    {
        System.out.println("The Lower case value is "+string.toLowerCase());
        System.out.println("The Upper case value is "+string.toUpperCase());
        System.out.println("The concate value is "+string.concat(string2));
        System.out.println("Char At(index) " + string.charAt(5));
        System.out.println("subString(index) " + string.substring(5));
        System.out.println("indexOF() "+string2.indexOf(string));
        System.out.println("LastindexOF() "+string2.lastIndexOf(string));
        System.out.println("The Repeating it "+string.repeat(5)+"\t");
        System.out.println("The replace of first String is "+string.replace(string, string2));
    }
}
public class MethodsWithReflection
{
    static Scanner in = new Scanner(System.in);
     
    public static void main(String[] args) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException
    {

        System.out.println("---\"The Method With Reflection \"---");

        TheGameOfMultipleParametarizedMethod TGOMPM = new TheGameOfMultipleParametarizedMethod();
        Method[] m = TGOMPM.getClass().getDeclaredMethods();

        for(Method x:m)
        {
            x.setAccessible(true);
            System.out.println("enter 2 string : ");
            x.invoke(TGOMPM,in.nextLine(),in.nextLine());
        }
    }    
}