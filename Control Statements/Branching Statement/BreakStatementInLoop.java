/*just we will use Break Statement to terminate the Loop */

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class BreakStatementInLoop
{
    public static void main(String args[])throws IOException
    {
        InputStreamReader read = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(read);

        String Secrate = "Syed";

        System.out.println("---\"Break Statement\"---");

        int i = 0;

        while(i<3)
        {
            System.out.println("enter your message");
            String password = in.readLine();

            if(Secrate.equalsIgnoreCase(password))
            {
                System.out.println("568963220 - is the key to treasure ");
                break;
            }
            i++;
        }
    }
}