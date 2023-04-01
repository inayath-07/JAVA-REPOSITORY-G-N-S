/*just a simple example of for loop */

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class ForLoop
{
    public static void main(String[] args)throws IOException
    {
        InputStreamReader read = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(read);

        System.out.println("---\"For Loop\"---");

        System.out.println("enter the message you want to print ");
        String message = in.readLine();

        for(int i = 0;i<10;i++)
        {
            System.out.println(message);
        }

    }
}
