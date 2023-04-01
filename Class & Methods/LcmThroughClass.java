/*This program will find Lcm of a given numbers */

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

class Lcm
{
    private static int max_num;

    public void lcm(int num,int num2)
    {
        max_num = Math.max(num, num2);

        while(true)
        {
            if(max_num%num==0 && max_num%num2==0)
            {
                break;
            }

            else
            {
                max_num++;
            }
        }

        System.out.println("The LCM of "+num+" & "+num2+" is "+max_num);
    }
}
public class LcmThroughClass
{
    public static void main(String[] args)throws IOException
    {
        InputStreamReader read = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(read);

        System.out.println("---\"LCM through class\"---");

        System.out.println("enter numbers to find lcm");
        int num = Integer.parseInt(in.readLine());
        int num2 = Integer.parseInt(in.readLine());

        Lcm _lcm_ = new Lcm();
        _lcm_.lcm(num, num2);
    }
}