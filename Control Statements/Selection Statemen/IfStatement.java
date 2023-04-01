/*This program will just check for the conditions */

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class IfStatement
{
    public static void main(String[] args)throws IOException
    {
        //creating ISR object
        InputStreamReader read = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(read);

        System.out.println("---\"Only If Statement\"---");

        System.out.print("enter your first name :");
        String firstname = in.readLine();

        System.out.print("enter your second name :");
        String secondname = in.readLine();

        if(firstname.startsWith("syed shah"))
        {
            System.out.println(secondname);
        }
        if(secondname.endsWith("i"))
        {
            System.out.println("hello quadri ");
        }
    }    
}