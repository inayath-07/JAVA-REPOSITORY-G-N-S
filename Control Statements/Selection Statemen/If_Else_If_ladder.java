/*this program will find for carrosponding month  */

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class If_Else_If_ladder
{
    public static void main(String[] args)throws IOException
    {
        InputStreamReader read = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(read);

        //System.out.println("---\"if else if ladder\"---");
        System.out.print("enter month number :");
        int month_num = Integer.parseInt(in.readLine());

        if(month_num==1)
        {
            System.out.println("Janvary");
        }
        else if(month_num==2)
        System.out.println("febrary");

        else if(month_num==3)
        System.out.println("march");

        else if(month_num==4)
        System.out.println("april");

        else if(month_num==5)
        System.out.println("may");

        else if(month_num==6)
        System.out.println("june");

        else if(month_num==7)
        System.out.println("july");

        else if(month_num==8)
        System.out.println("augst");

        else if(month_num==9)
        System.out.println("september");

        else if(month_num==10)
        System.out.println("october");

        else if(month_num==11)
        System.out.println("november");

        else if(month_num==12)
        System.out.println("december");

        else 
        System.out.println("enter correct choice");

    }
}
