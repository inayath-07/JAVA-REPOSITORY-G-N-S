/*This program will find out if the number is odd or even*/

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class SwitchStatement
{
    public static void main(String[] args)throws IOException
    {
        InputStreamReader read = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(read);

        System.out.println("---\"Switch case \"---");

        System.out.println("enter your number :");
        int num = Integer.parseInt(in.readLine());

        switch(num%2)
        {
            case 0:
            {
                System.out.println("it is an even number");
                break;
            }
            default :
            {
                System.out.println("it is not an even number");
                break;
            }    
        }

    }    
}