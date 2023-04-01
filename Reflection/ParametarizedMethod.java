import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;

/*The basic program to demonstarate Method Having parameters and
invoking it from outside */

class DemonstaratingParametarizeMethod
{
    @SuppressWarnings("unused")
    private void toOtherForm(int changeform)
    {
        System.out.println("The BInary form of "+changeform+" is "+Integer.toBinaryString(changeform));
        System.out.println("The Octal form of "+changeform+" is "+Integer.toOctalString(changeform));
        System.out.println("The Hexadecimal form of "+changeform+" is "+Integer.toHexString(changeform));
        
        System.out.println("the String representation "+Integer.toString(changeform));

        System.out.println("Other form");
        System.out.println("The number of bits after 2's complemetn is "+Integer.bitCount(changeform));
        System.out.println("The Hash Code is "+Integer.hashCode(changeform));
        System.out.println("The msb bit is "+Integer.highestOneBit(changeform));
    }
}

public class ParametarizedMethod
{
    /**
     * @param args
     * @throws NoSuchMethodException -- is used when If the specified 
     * Method is not present 
     * @throws SecurityException -- is used when security is broken 
     * it is unchecked Exception throwm by Security manager
     * @throws InvocationTargetException -- InvocationTargetException is a checked exception that wraps an exception thrown by 
     * an invoked method or constructor.
     * @throws IllegalArgumentException -- thrown to indicate that a method has been passed an 
     * illegal or inappropriate argument
     * @throws IllegalAccessException -- is is throwm when if we try to access
     * private and protected members of another class
     */
    public static void main(String[] args) throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException
    
    {
        Scanner in = new Scanner(System.in);

        System.out.println("---\"Parametazied Method \"---");

        DemonstaratingParametarizeMethod DPM = new DemonstaratingParametarizeMethod();

        Method[] m = DPM.getClass().getDeclaredMethods();
        for(Method x:m)
        {
            if(x.getName().equals("toOtherForm"))
            x.setAccessible(true);
            x.invoke(DPM,in.nextInt());
        }

        in.close();
    }
}