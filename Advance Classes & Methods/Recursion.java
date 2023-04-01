/*This class is use to implement recursion by means of factorial
 factorial of a number is 
 1*2*3*n
*/

import java.util.Scanner;

class Factorial
{
    double Fact(int x)
    {
        double result;

        if(x==1)
        return 1;

        else
        {
            result = Fact(x-1)*x;
            return result;
        }
    }
}

public class Recursion
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);

        System.out.println("---\"The recursion\"---");

        Factorial F = new Factorial();
        System.out.print(F.Fact(in.nextInt())+"\t");

        in.close();
    }
}