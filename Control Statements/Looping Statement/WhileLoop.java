/*just a sample on Whiel loop */

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class WhileLoop
{
    public static void main(String[] args)throws IOException
    {
        InputStreamReader read = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(read);

        System.out.println("---\"While loop \"---");

        String p = "Syed";

        while(true)
        {
            System.out.println("enter password ");
            String password = in.readLine();

            if(password.equals(p))
            {
                System.out.println("hello mister");
                break;
            }
        }

    }
}