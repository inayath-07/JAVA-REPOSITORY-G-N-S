/*The following program demonstrate
 * length()
 * concatenation using + with string
 * concatenation using + with another data type
*/
class TheStringOperation
{
    void stringOperators()
    {
        String string = new String("Syed Shah Inayath"); //String constructor
        String string2 = new String(" Ullah Quadri");
        System.out.println("Using length \nThe length of "+string+" is "+string.length());
        System.out.println("Using + operator to concate 2 string "+(string+string2));
        System.out.println("Using + operator to concate string and another type  "+(string+" "+20));
    }
}
public class StringOperation
{
    public static void main(String[] args)
    {
        System.out.println("---\"StringOperation.main()\"---");
        TheStringOperation TSO = new TheStringOperation();
        TSO.stringOperators();
    }
}