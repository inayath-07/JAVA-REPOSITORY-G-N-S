/*this program will deal with all bitwise operator 
 * & it is simple
*/

import java.util.Scanner;

public class BitwiseOperator_Simple
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("---\"BitwiseOperator\"---");
        
        System.out.println("enter 2 numbers to perfrom Bitwise operation on them");
        int num = in.nextInt();
        int num1 = in.nextInt();

        System.out.println("---------------------");

        System.out.println("Bitwise Unary Operator ~(not)");
        System.out.println("on 1st number"+~num);
        System.out.println("on 2nd number"+~num1);
        System.out.println("~ it compliment the binary number ");

        System.out.println("---------------------");

        System.out.println("Bitwise Binary Operator &(and)");
        System.out.println("1st & 2nd number "+(num & num1));
        System.out.println("2nd & 1st number "+(num1 & num));
        System.out.println("& it return 1 if both the binary numbers are 1 bit by bit");

        System.out.println("---------------------");

        System.out.println("Bitwise Binary Operator |(or)");
        System.out.println("1st and 2nd number "+(num|num1));
        System.out.println("2nd and 1st number "+(num1|num));
        System.out.println("| it return 1 if any of the binary number is 1");

        System.out.println("---------------------");

        System.out.println("Bitwise Binary Operator ^(Ex Or)");
        System.out.println("1st and 2nd number "+(num^num1));
        System.out.println("2nd and 1st number "+(num1^num));
        System.out.println("retrun 1 if there are different number i.e. 0 1 = 1 ");

        System.out.println("---------------------");

        System.out.println("Bitwise Binary Operator >>(Right Shift)");
        System.out.println("on 1st number "+(num>>num1));
        System.out.println("on 2nd number "+(num1>>num));
        System.out.println(">> will shift the bit towards right side depends on the right side number");

        System.out.println("---------------------");

        System.out.println("Bitwise Binary Operator <<(Left shift)");
        System.out.println("on 1st number "+(num<<num1));
        System.out.println("on 2nd number "+(num1<<num));
        System.out.println("it will shift the bit towards left side depends on right side number1");

        System.out.println("---------------------");

        System.out.println("Bitwise Binary Operator >>>(Right Shift zero fill)");
        System.out.println("on 1st number "+(num>>>num1));
        System.out.println("on 2nd number "+(num1>>>num1));
        System.out.println("its function is same as Right Shift operator but it is unsigned right shift");
        //all closing statement
        in.close();

    }
}