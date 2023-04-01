/*This program will perform Bitwise operation on two numbers using
 * Bitwise Compound Assignment Operator. it is a simple program
*/

import java.util.Scanner;
public class BitwiseCompoundAssignmentOperator
{
    public static void main(String args[])
    {
        //creating SCR object
        Scanner in = new Scanner(System.in);

        //declaaration of variable
        int num,num1;

        System.out.println("---\"BitwiseCompoundAssignmentOperator\"---");

        System.out.println("enter 2 numbers to perfrom Bitwise operation on them");
        num = in.nextInt();
        num1 = in.nextInt();

        System.out.println("---------------------");

        System.out.println("Bitwise Binary Operator &=(and assignment)");
        System.out.println("1st & 2nd number "+(num &= num1));
        System.out.println("2nd & 1st number "+(num1 &= num));
        System.out.println("& it return 1 if both the binary numbers are 1 bit by bit");
        System.out.println("and will it is equivalent to a = a&b;");

        System.out.println("---------------------");

        System.out.println("Bitwise Binary Operator |=(or assignment)");
        System.out.println("1st and 2nd number "+(num|=num1));
        System.out.println("2nd and 1st number "+(num1|=num));
        System.out.println("| it return 1 if any of the binary number is 1");
        System.out.println("and it is equivalent to a = a|b");

        System.out.println("---------------------");

        System.out.println("Bitwise Binary Operator ^=(Ex Or)");
        System.out.println("1st and 2nd number "+(num^=num1));
        System.out.println("2nd and 1st number "+(num1^=num));
        System.out.println("retrun 1 if there are different number i.e. 0 1 = 1 ");
        System.out.println("and it is equivalent to a = a^b");

        System.out.println("---------------------");

        System.out.println("Bitwise Binary Operator >>=(Right Shift assignment)");
        System.out.println("on 1st number "+(num>>=num1));
        System.out.println("on 2nd number "+(num1>>=num));
        System.out.println(">> will shift the bit towards right side depends on the right side number");
        System.out.println("and it is equivalent to a = a>>nmber");

        System.out.println("---------------------");

        System.out.println("Bitwise Binary Operator <<=(Left shift assignment)");
        System.out.println("on 1st number "+(num<<=num1));
        System.out.println("on 2nd number "+(num1<<=num));
        System.out.println("it will shift the bit towards left side depends on right side number1");
        System.out.println("and it is euivalent to a = a>>number");

        System.out.println("---------------------");

        System.out.println("Bitwise Binary Operator >>>=(Right Shift zero fill assignment)");
        System.out.println("on 1st number "+(num>>>=num1));
        System.out.println("on 2nd number "+(num1>>>=num1));
        System.out.println("its function is same as Right Shift operator but it fill the leftover zeros");
        System.out.println("and it is equivalent to a = a>>>number");
        //all closing statement
        in.close();
    }
}