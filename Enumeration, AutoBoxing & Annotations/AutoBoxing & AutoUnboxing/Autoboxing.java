//Just a simple program to understand The Autoboxing
public class Autoboxing
{
    @SuppressWarnings("Deprecated")
    public static void main(String[] args)
    {
        System.out.println("---\"AutoBoxing\"---");
        
        //initial values 
        Integer a = 100;
        int b = 50;
        
        //autoboxing
        int c = a;
        //auto-unboxing
        Integer d = new Integer(b);

        System.out.println("The autoboxed value is "+c);
        System.out.println("The auto-unboxed value is "+d);
    }
}