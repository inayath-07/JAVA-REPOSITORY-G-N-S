/*this program will store number using ISR*/
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Data_Type_ISR
{
    public static void main(String[] args)throws IOException
    {
        //creating ISR  object
        InputStreamReader read = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(read);

        System.out.println("---\"Data type using ISR\"---");
        //declaration of variable
        byte a;
        System.out.println("enter byte number ");
        a = Byte.parseByte(in.readLine());
        System.out.println("entered number is "+a);
        System.out.println("--------");

        short b;
        System.out.println("enter short number ");
        b = Short.parseShort(in.readLine());
        System.out.println("entered number is "+b);
        System.out.println("--------");

        int c;
        System.out.println("enter integer number ");
        c = Integer.parseInt(in.readLine());
        System.out.println("entered integer is "+c);
        System.out.println("--------");

        long d;
        System.out.println("enter long number ");
        d = Long.parseLong(in.readLine());
        System.out.println("entered longed number is "+d);
        System.out.println("--------");

        float e;
        System.out.println("enter floating number is ");
        e = Float.parseFloat(in.readLine());
        System.out.println("entered float number is "+e);
        System.out.println("--------");

        double f;
        System.out.println("enter double number ");
        f = Double.parseDouble(in.readLine());
        System.out.println("entered floating point numberr is "+f);
        System.out.println("--------");

        char g;
        System.out.println("enter character ");
        g = (char)(in.read());
        System.out.println("entered character is "+g);
        System.out.println("--------");

        String h;
        System.out.println("enter String ");
        h = in.readLine();
        System.out.println("entered String is "+h);
    }    
}