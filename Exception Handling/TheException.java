//This program will deal with 2 types of errors

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class TheException
{
    public static void main(String[] args)throws IOException
    {
        InputStreamReader read = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(read);

        try
        {
            System.out.println("---\"The Devision\"---");
            System.out.print("enter 1st number :");
            int num = Integer.parseInt(in.readLine());

            System.out.print("enter 2nd number :");
            int num1 = Integer.parseInt(in.readLine());

            int x = num/num1;

            System.out.println(x);
        }catch(NumberFormatException IOE)
        {
            System.out.println("Input Output error \n unable to convert type String to int");
        }catch(ArithmeticException AE)
        {
            System.out.println("unable to divide with 0");
        }
    }
}