//this program will just generate 

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

//just declaring Error
class DecMulti extends Exception
{
    DecMulti(int num,int num2)
    {
        System.out.println("The numbers are against rules ");
        System.out.println("as "+num+"<"+num2);
    }
}

class ImplementException 
{
    static void a(int num,int num1)throws DecMulti
    {
        if(num<num1)
        throw new DecMulti(num,num1);
    }
}
public class UserDefineException
{
    //declaration of variable
    static int num;
    static int num1;
    static int res;
    static int res1;
    public static void main(String[] args)throws IOException
    {
        InputStreamReader read = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(read);

        System.out.println("---\"User Define Exception\"---");
        try
        {
            System.out.print("enter 1st number :");
            num = Integer.parseInt(in.readLine());

            System.out.print("enter 1st number :");
            num1 = Integer.parseInt(in.readLine());

            ImplementException.a(num, num1);

            int min = Math.min(num, num1);
            for(int i = 1;i<min+1;i++)
            {
                res = num*i;
                res1 = num1*i;
            }

            System.out.println(res*res1);

        }catch(DecMulti DM)
        {
            System.out.println();
        }
    }
}