/*porgraom to deomnstrate break with key */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BreakInSwitchCase
{
    public static void main(String[] args)throws IOException
    {
        InputStreamReader read = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(read);

        System.out.println("---\"Break Statement With Switch Case \"---");

        System.out.print("enter operator to perform tsk :");
        String operator = in.readLine();

        switch(operator)
        {
            case "+":
            {
                System.out.println("enter 2 numbers ");
                int a = Integer.parseInt(in.readLine());
                int b = Integer.parseInt(in.readLine());

                System.out.println(a+b);

                break;
            }
            case "-":
            {
                System.out.println("enter 2 numbers ");
                int a = Integer.parseInt(in.readLine());
                int b = Integer.parseInt(in.readLine());

                System.out.println(a-b);

                break;
            }
            case "*":
            {
                System.out.println("enter 2 numbers ");
                int a = Integer.parseInt(in.readLine());
                int b = Integer.parseInt(in.readLine());

                System.out.println(a*b);

                break;
            }
            case "/":
            {
                System.out.println("enter 2 numbers ");
                int a = Integer.parseInt(in.readLine());
                int b = Integer.parseInt(in.readLine());

                System.out.println(a/b);

                break;
            }
            case "%":
            {
                System.out.println("enter 2 numbers ");
                int a = Integer.parseInt(in.readLine());
                int b = Integer.parseInt(in.readLine());

                System.out.println(a%b);

                break;
            }

            default :
            System.out.println(operator + " is not listed under Arithamatic");
        }
    }    
}
