/*program to demonstrate Dynamic Method dispatch by means of
* simple initialization
*/

import java.util.Scanner;

class SuperClass
{
    public double nextThree/*Multiple*/(double x,int size)
    {
        double result = 1;

        for(int i = 0;i<size;i++)
        {
            result*= x++;
        }

        return result;
    }
}

class SubClass extends SuperClass
{
    public double nextThree/*Dividend*/(double num,int size)//this method will run by second object
    {
        double result = 1;
        for(int i = 0;i<size;i++)
        {
            result/=num++;
        }
        return result;
    }
}

public class DynamicMethodDispatch_part2
{
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args)
    {
        System.out.println("---\"Dynamic Method Dispatch \"---");

        SuperClass SC = new SuperClass();
        
        //here is the use of dynamic method dispatch
        System.out.println(SC.nextThree(in.nextDouble(),in.nextInt()));

        SC = new SubClass();
        System.out.println(SC.nextThree(in.nextDouble(),in.nextInt()));

    }
}