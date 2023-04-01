import java.lang.annotation.Target;
import java.lang.reflect.Method;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface TheUnknownForm
{
    int num() default 20;
}

class TheUnknownForm1
{
    /**
     * @param args
     * @throws NoSuchMethodException -- throw when there is no Method found
     * @throws SecurityException -- Thrown by the security manager to 
     * indicate a security violation
     */
    @TheUnknownForm(num = 16)
    public static void main(String[] args) throws NoSuchMethodException, SecurityException
    {
        System.out.println("---\"The Unknow Form\"---");
        TheUnknownForm1 TUF1 = new TheUnknownForm1();
        
        Method[] m = TUF1.getClass().getMethods();
        for(Method x:m)
        {
            if(x.isAnnotationPresent(TheUnknownForm.class))
            {
                TheUnknownForm annotation = x.getAnnotation(TheUnknownForm.class);

                Integer val = annotation.num();//auto Boxing
                System.out.println("The Number of 1's in 2's compliment of "+" val "+Integer.bitCount(val));
                System.out.println("Decoding " +Integer.decode("020"));
                System.out.println("Decoding " +Integer.decode("#020"));
                System.out.println("Decoding " +Integer.decode("0X20"));
                System.out.println("Decoding " +Integer.decode("0x20"));
                System.out.println(Integer.compare(val, val)); //if val 1 > val 2 = 1 or val1<val2 = -1 or val1 == val2 = 0
                System.out.println(Integer.compareUnsigned(val-1,val)); //same but it is un sign
                System.out.println(Integer.numberOfLeadingZeros(val));
                System.out.println(Integer.class);
                System.out.println(Integer.TYPE);
                System.out.println("Just converting to other number system "+Integer.toUnsignedString(5, 2));
                System.out.println(Integer.rotateLeft(1, 1));
                System.out.println(Integer.rotateRight(1, 1));
                System.out.println("Returnin the lsb of "+val+" "+Integer.lowestOneBit(val));
                System.out.println("Returnin the msb of "+val+" "+Integer.highestOneBit(val));
                System.out.println(Integer.numberOfTrailingZeros(val));
                System.out.println(Integer.divideUnsigned(val, 5));
                System.out.println(Integer.parseInt("5256", 1, 3, 0)); //error
                System.out.println(Integer.remainderUnsigned(val,5));
                System.out.println("The signum value is "+Integer.signum(val));
            }
        }
    }
}