/*Clear java program to understand the concept of Dynamic Method Dispatch
 * run this program in commandline 
 * javac DynamicMethodDispatch.java
 * java DynamicMethodDispatch
*/

import java.util.Scanner;

class Decrementing
{
    void DecNum(double num,int times)
    {
        System.out.println("your number "+num+" will decrement "+times+" times");

        for(int i = 0;i<times;i++)
        {
            num--;
        }

        System.out.println("the "+times+" times decremented value is "+num);

        System.out.println("----------------------");
    }
}

class SubClass extends Decrementing
{
    @Override
    void DecNum(double num,int times)
    {
        System.out.println("your number "+num+" will decrement "+times+" times");

        for(int i = 0;i<times;i++)
        {
            num--;
        }

        System.out.println("the "+times+" times decremented value is "+num);

        System.out.println("----------------------");
    }

}
class $ubClass extends Decrementing
{
    @Override
    void DecNum(double num,int times)
    {
        System.out.println("your number "+num+" will decrement "+times+" times");
        for(int i = 0;i<times;i++)
        {
            num--;
        }

        System.out.println("the "+times+" times decremented value is "+num);
        System.out.println("----------------------");
    }
}
public class DynamicMethodDispatch
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("---\"Dynamic Method Dispatch \"---");

        Decrementing D = new Decrementing();
        SubClass SC = new SubClass();
        $ubClass $C = new $ubClass();

        //adding refernce ---  the reference of most / Stand alone class
        Decrementing refernce;

        //refering to SuperClass method
        refernce = D;
        System.out.println("enter your number & time");
        refernce.DecNum(in.nextDouble(),in.nextInt());

        //refering to SubClass method
        refernce = SC;
        System.out.println("enter your number & time");
        refernce.DecNum(in.nextDouble(),in.nextInt());

        //refering to $uBClass method
        refernce = $C;
        System.out.println("enter your number & time");
        refernce.DecNum(in.nextDouble(),in.nextInt());

        //all closing statements
        in.close();
    }    
}

/*the real advantage of dynamic method dispatch
 * is to solve overriding problem at run time 
 * when the object is refered then method refer to that reernce will execute
 */