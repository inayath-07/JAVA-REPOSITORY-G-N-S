/*This program will play with String Methods using nested if */

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class NestedIf
{
    public static void main(String[] args)throws IOException
    {
        //creating object of ISR
        InputStreamReader read = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(read);

        System.out.println("---\"Nested if\"---");

        System.out.println("enter your name :");
        String name = in.readLine();

        System.out.println("enter second naem :");
        String secondname = in.readLine();
        if(name.isEmpty())
        {
            if(secondname.equalsIgnoreCase("syed shah inayath ullah quadri"))
            {
                System.out.println("enter your first name to execute further");
            }
        }
    }    
}