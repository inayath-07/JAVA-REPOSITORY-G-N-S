/*The use of tyr with resourc is that it is use to 
 * automatically close all resource at the end
*/
import java.util.Scanner;

public class TryWithResource
{
    static Integer num;
    public static void main(String[] args)
    {
        System.out.println("---\"Try with resource \"---");
        try(Scanner in = new Scanner(System.in))
        {
            System.out.print("enter any number to find it's other form:");
            num = in.nextInt();

            System.out.println("the binary number for "+num+" is "+Integer.toBinaryString(num));
            System.out.println("the hexa dicimal form of "+num+" is "+Integer.toHexString(num));
            System.out.println("the octa dicimal form of "+num+" is "+Integer.toOctalString(num));

            //in.close(); --> no need
        }
    }    
}