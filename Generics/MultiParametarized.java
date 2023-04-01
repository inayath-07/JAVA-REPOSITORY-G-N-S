import java.util.Scanner;

/*Java Program to demonstrate Multiple parameters of genreics */
public class MultiParametarized <T,T1>
{
    Scanner in = new Scanner(System.in);

    T1 T1num;
    void Factorial()
    {
        int fact = 1;
        System.out.println("enter The number to find it's factorial ");

        @SuppressWarnings("unchecked")
        T num = (T)in.nextLine();
        String a = num.toString();
 
        //The Logic for factorial
        for(int i = 1;i<Integer.valueOf(a);i++)
        {
           fact *=i;
        }
        System.out.println("The factorial of "+num+" is "+fact);

        System.out.println(T1num);
    }

    public static void main(String[] args)
    {
        System.out.println("---\"MultiParametarized.main()\"---");
        MultiParametarized<Integer,Float> MP = new MultiParametarized<>();
        MP.Factorial();
    }    
}