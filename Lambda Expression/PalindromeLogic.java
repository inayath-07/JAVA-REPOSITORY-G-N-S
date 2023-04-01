import java.util.Scanner;

public class PalindromeLogic
{
    public static void main(String[] args)
    {
        System.out.println("---\"PalindromeLogic.main()\"---");

        Scanner in = new Scanner(System.in);
        
        //declaration of variable
        int num,result,sum=0,temp;
        
        System.out.print("enter a number : ");
        num = in.nextInt();

        temp = num;
        while(num>0)
        {
            result = num%10;
            /*
            *it will return the reminder which is helpful to find
            *what is last number
            */
            sum=(sum*10)+result; 
            /* storing the last value obtain by
            the above process
            */
            num = num/10;
            /*
            * Storing number after removing reminder or last part
            */
        }

        if(temp == sum)
        {
            System.out.println("yes it is palindrome");
        }
        else
        {
            System.out.println("it is not a palindrome");
        }

        in.close();
    }
}