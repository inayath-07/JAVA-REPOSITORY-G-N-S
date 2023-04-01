/*Java program to find if the number is palindrome ot not */

//importing packages
import java.util.Scanner;

interface PalindromeInterface
{
    String Palindrome();
}

public class IsPalindromeNumber
{
    public static void main(String[] args)
    {
        //creating object of Scanner
        Scanner in = new Scanner(System.in);

        PalindromeInterface PI = ()->
        {
            System.out.println("enter your input ");

            StringBuffer SB = new StringBuffer(in.nextLine());
            StringBuffer backup = new StringBuffer(SB);
            StringBuffer SB1 = new StringBuffer(SB.reverse());
        
            if(backup.toString().equals(SB1.toString()))
            {
                return ("Yes it a palindrome");
            }
            else
            return ("sorry it is not a palindrome");

            
        };
        System.out.println(PI.Palindrome());

        in.close();
    }
} 