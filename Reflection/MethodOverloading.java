import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import java.util.Scanner;
class TheFunWithMethod
{
    @SuppressWarnings("unused")
    private void TheOverloader()
    {
        Scanner in = new Scanner(System.in);

        //declaration of variable
        int large = 0;
        int mid = 0;
        int small = 0;
        System.out.println("enter 3 numbers : ");
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        if(a>b)
        {
            if(a>c)
            {
                large = a;
            }
            else
            {
                large = c;
            }
        }

        if(b>a)
        {
            if(b>c)
            {
                large = b;
            }
            else
            {
                large = c;
            }
        }

        if(large == a)
        {
            small = Math.min(b,c);
        }

        if(large == b)
        {
            small = Math.min(a,c);
        }

        if(large == c)
        {
            small = Math.min(b,a);
        }

        if(large>a && a>small)
        {
            mid = a;
        }

        if(large>b && b>small)
        {
            mid = b;
        }

        if(large>c && c>small)
        {
            mid = c;
        }

        System.out.println("------------------");
        System.out.println(large);
        System.out.println(mid);
        System.out.println(small);
        in.close();
    }

    @SuppressWarnings("unused")
    private void TheOverloader(int[] a)
    {
        for(int i = 0;i<a.length;i++)
        {
            System.out.println(a[i]);
        }
    }
}

public class MethodOverloading
{
    static Scanner in = new Scanner(System.in);
    static int a[] = new int[5];
    public static void main(String[] args) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException
    {
        TheFunWithMethod TFWM = new TheFunWithMethod();

        //reflection
        Method[] m = TFWM.getClass().getDeclaredMethods();

        for(int i = 0;i<a.length;i++)
        {
            a[i] = in.nextInt();
        }
        for(Method x:m)
        {
            if(x.getName().equals("TheOverloader"))
            {
                x.setAccessible(true);
                //x.invoke(TFWM);
                x.invoke(TFWM,a);
            }
        }
    }
}