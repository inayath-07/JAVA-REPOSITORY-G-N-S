import java.util.Scanner;

public class BooleanBoxing
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        System.out.println("---\"The Boolean autoboxing\"---");
        System.out.println("enter boolean value ");
        Boolean B = in.nextBoolean();

        if(B)
        System.out.println("the hash code value is "+B.toString());

        in.close();
    }    
}