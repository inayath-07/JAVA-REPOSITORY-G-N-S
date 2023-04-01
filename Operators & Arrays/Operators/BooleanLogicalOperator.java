/*This program will perform Logical Operation on Boolean 
 *Logical operator
*/

import java.util.Scanner;

public class BooleanLogicalOperator
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        System.out.println("---\"BooleanLogicalOperator\"---");
        System.out.println("&\t|\t^\t||\t&&\t!\t\t?:");

        System.out.println("------------------------");

        System.out.println("info about logical &");
        System.out.println("it will return true if both values are true");
        System.out.println("it will check for both the conditions ");
        System.out.println("example "+(false & true));

        System.out.println("------------------------");

        System.out.println("info about logical OR ");
        System.out.println("it will return true if any one of the condition is true");
        System.out.println("both expression are checked");
        System.out.println("example "+(true|false));

        System.out.println("------------------------");

        System.out.println("info about logical ^");
        System.out.println("it will return true if only one condtion is true");
        System.out.println("example "+(true^false));

        System.out.println("------------------------");

        System.out.println("info about logical !");
        System.out.println("it will reverse result ");
        System.out.println("example "+(!(true)));

        System.out.println("------------------------");

        System.out.println("info about chort circuit &&");
        System.out.println("it will true if both conditions are true");
        System.out.println("it further doesnot get evaluated if first condtion is false ");
        System.out.println("example "+(true&&false));//if you put like this false && true it will throw error

        System.out.println("------------------------");

        System.out.println("info about short circuit ||");
        System.out.println("it will return true if only one conditon is true");
        System.out.println("if first condition is true it will not execute next condition");
        System.out.println("example "+(false||true)); //i you put like this true||false it will thorw error

        System.out.println("------------------------");

        System.out.println("---\"Ternary operator\"---");

        System.out.println("enter 2 number to check which number is greater ");
        double num = in.nextDouble();
        double num1 = in.nextDouble();

        //ternary operator
        String res = (num>=num1)?(num+">="+num1):(num1+">="+num);
        System.out.println(res);

        //all closing statement
        in.close();
    }
}