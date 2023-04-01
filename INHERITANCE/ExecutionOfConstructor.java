//program on when constructors are executed
import java.util.Scanner;

class Sum
{
    Scanner in = new Scanner(System.in);
    static int num;
    static int num2;

    Sum()
    {
        System.out.println("Constructor of 1st class");
        
        System.out.println("enter two number to find it's sum");
        num = in.nextInt();
        num2 = in.nextInt();

        System.out.println("the sum is "+(num+num2));

        System.out.println("---------------------");        
    }
}

class Multiple extends Sum
{
    Multiple()
    {
        System.out.println("Constructor of 2nd class");

        System.out.println("enter 2 number to find its product");
        num = in.nextInt();
        num2 = in.nextInt();

        System.out.println("the product of "+num+"*"+num2+" is "+(num*num2));

        System.out.println("---------------------");
    }
}

class Mod extends Multiple
{
    Mod()
    {
        System.out.println("Constructor of 3rd class");

        System.out.println("enter two number to know the remender of 1st number by means of 2nd num");
        num = in.nextInt();
        num2 = in.nextInt();

        System.out.println("the reminder is "+(num%num2));

        System.out.println("---------------------");
    }
}
public class ExecutionOfConstructor
{
    public static void main(String args[])
    {
        System.out.println("---\"ExecutionOfConstructor\"---");

        Mod M = new Mod();

        System.out.println(M.getClass());
    }
}

/*Explanation */