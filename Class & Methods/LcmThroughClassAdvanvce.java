/*This program will find out lcm of 5 different numbers */

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

class FindingLcm
{
    private static int a[] = new int[10];
    private static int i;  //here we can can use static
    private static int max_number;
    public void findingLcm(int...var_args)
    {
        for(int x:var_args)
        {
            a[i] = x;
            i++;
        }

        //finding max number
       if(a[0]>a[1])
       {
            max_number = a[0];

            if(a[0]>a[2])
            {
                max_number = a[2];
            }
       }

       if(a[1]>a[0])
       {
            max_number = a[1];

            if(a[1]<a[2])
            {
                max_number = a[2];
            }
       }

        while(true)
        {
            if(max_number%a[0]==0 && max_number%a[1]==0 && max_number%a[2]==0)
            {
                break;
            }
            else
            max_number++;
        }
        System.out.println("the lcm of "+a[0]+", "+a[1]+" & "+a[2]+" is "+max_number);
    }
}
public class LcmThroughClassAdvanvce
{
    public static void main(String[] args)throws IOException
    {
        InputStreamReader read = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(read);

        System.out.println("---\"LCM Through Clsss With Variable Arguments \"---");

        System.out.println("enter numbers to find Lcm ");
        int num =Integer.parseInt(in.readLine());
        int num1 = Integer.parseInt(in.readLine());
        int num2 = Integer.parseInt(in.readLine());

        FindingLcm _findingLcm_ = new FindingLcm();
        _findingLcm_.findingLcm(num,num1,num2);
    }    
}