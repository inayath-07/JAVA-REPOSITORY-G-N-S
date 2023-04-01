/*Program to demonstrate Number converting to String*/
public class ConvertingToString
{
    public static void main(String args[])
    {
        //usign to toString()
        Integer num = 20;
        String S = num.toString();

        //usign to valueOf()
        Integer num1 = 020;
        String S1 = String.valueOf(num1);

        System.out.println("---\"ConvertingToString.main()\"---");

        System.out.println(S);
        System.out.println(S1);
    }
}