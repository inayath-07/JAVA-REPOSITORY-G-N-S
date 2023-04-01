import java.util.Scanner;

public class GettingStringFormOfObject
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        System.out.println("enter a value to enter it into Integer");
        Integer input = in.nextInt();//auto Boxing 

        System.out.println("The String form of "+input+" is "+input.toString());

        in.close();
    }
}