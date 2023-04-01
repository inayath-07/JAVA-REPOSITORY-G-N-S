/*This program will find HCF of variable length number*/

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

class VarHcf
{
    private static int a[] = new int[10];
    private static int i = 1;
    private static int max;
    private static int hcf = 1;
    public void varHcf(int...var)
    {
        //allocating
        for(int x : var)
        {
            a[i] = x;
            i++;
        }

        //finding maximum number
        for(i = 1;i<a.length;i++)
        {
            for(int j = 2;j<a.length;j++)
            {
                if(a[i]>a[j])
                max = a[i];

                else
                max = a[j];
            }
        }

        for(i = 1;i<max;i++)
        {
            if(a[i]%2==0 && a[i+1]%2==0)
            {
                hcf = i;
            }
        }
        System.out.println("the HCF of all number is "+hcf);
    }
}
public class ClassWithMethodAdvanced
{
    public static void main(String[] args)throws IOException
    {
        InputStreamReader read = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(read);

        System.out.println("---\"Class With Method Advanced\"---");

        //declaration of vadriable
        int a[] = new int[6];

        System.out.println("enter your numbers ");
        for(int i = 0;i<5;i++)
        {
            a[i] = Integer.parseInt(in.readLine());
        }

        VarHcf vHcf = new VarHcf();
        vHcf.varHcf(a);

    }    
}