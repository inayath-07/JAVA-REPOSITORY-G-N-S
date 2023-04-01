/*this program will store values dynamacally using Scanner*/
import java.util.Scanner;
public class Data_Type_Scanner
{
    public static void main(String args[])
    {
        //creating objects of Scanner
        Scanner in = new Scanner(System.in);
        System.out.println("---\"Data type initialisation by means of dynamacally\"---");

        //declaration of variable
        byte a;
        System.out.println("enter byte number ");
        a=in.nextByte();
        System.out.println("entered number is "+a);
        System.out.println("--------");

        short b;
        System.out.println("enter short number ");
        b = in.nextByte();
        System.out.println("entered number is "+b);
        System.out.println("--------");

        int c;
        System.out.println("enter integer number ");
        c = in.nextInt();
        System.out.println("entered integer is "+c);
        System.out.println("--------");

        long d;
        System.out.println("enter long number ");
        d = in.nextLong();
        System.out.println("entered longed number is "+d);
        System.out.println("--------");

        float e;
        System.out.println("enter floating number is ");
        e = in.nextFloat();
        System.out.println("entered float number is "+e);
        System.out.println("--------");

        double f;
        System.out.println("enter double number ");
        f = in.nextDouble();
        System.out.println("entered floating point numberr is "+f);
        System.out.println("--------");

        char g;
        System.out.println("enter character ");
        g = in.next().charAt(0);
        System.out.println("entered character is "+g);
        System.out.println("--------");

        String h;
        System.out.println("enter String ");
        h = in.nextLine();
        System.out.println("entered String is "+h);

        //all closing statement
        in.close();
    }
}