/*this is the simple program to perform relational operation 
 * between 2 values
*/

import java.util.Scanner;

public class RelationalOperator
{
    public static void main(String[] args)
    {
        //creating SCR Object
        Scanner in = new Scanner(System.in);

        System.out.println("---\"RelationalOperator\"---");
        System.out.println("==\t>\t<\t!=\t>=\t<=");

        //declaration of variale
        int num,num1;

        System.out.println("enter 2 number ");
        num = in.nextInt();
        num1 = in.nextInt();

        if(num==num1)
        System.out.println("you entered same numbers ");
    
        if(num!=num1)
        System.out.println("both numbers are different ");

        if(num>num1)
        System.out.println(num+">"+num1);

        if(num<num1)
        System.out.println(num+"<"+num1);

        if(num>=num1)
        System.out.println(num+" is greater than equalto "+num1);

        if(num<=num1)
        System.out.println(num1+" is greater than equalto "+num);

        else
        System.out.println("non of the conditions are satisfied ");
   
        //closing statements
        in.close();
    }
}