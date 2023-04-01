/*This program have following String methods
 * toString()
 * valueOf()
*/
class StringMethods
{
    String string = new String("Inayath");
    Integer pin = 020;
    String x = Integer.toString(pin);

    void stringMethods()
    {
        System.out.println("1.converting int to String using toString() --> only work on non primitive type prove "+x.getClass());
        System.out.println("2.converting int to String using valueOf()  --> can work with both primitive & non primitive type"+String.valueOf(pin).getClass());
    }
}
public class StringConversionMethods
{
    public static void main(String[] args)
    {
        System.out.println("---\"TenStringMethods.main()\"---");

        StringMethods SM = new StringMethods();
        SM.stringMethods();
    }
}