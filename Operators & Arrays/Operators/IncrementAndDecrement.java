/*this program will perform postfix & prefix expression evaluation
 * in my way
*/

import java.util.Scanner;

public class IncrementAndDecrement
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);

        System.out.println("---\"IncrementAndDecrement\"---");

        char inChar;
        System.out.print("press any key from keyboard :");
        inChar = in.next().charAt(0);

        //prefix
        ++inChar;
        System.out.println(inChar);

        //postfix
        inChar++;
        System.out.println(inChar);

        //some craziest expression 
        inChar = (char)(inChar++ + inChar++);
        System.out.println(inChar);

        inChar = (char)(++inChar + inChar++);
        System.out.println(inChar);

        inChar = (char)(inChar++ + ++inChar);
        System.out.println(inChar);

        inChar = (char)(++inChar + ++inChar);
        System.out.println(inChar);
        
        //all closing statement 
        in.close();
    }
}