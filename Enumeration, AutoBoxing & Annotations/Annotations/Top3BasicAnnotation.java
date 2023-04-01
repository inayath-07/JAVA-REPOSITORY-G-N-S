/**
* @author
* Syed shah inayath ullah quadri
*/
import java.util.Scanner;

@FunctionalInterface
interface Fact
{
    void FindingFact(int num);
}

class ImplementsFact implements Fact 
{
    @Override
    public void FindingFact(int num)
    {
        for(int i = num-1;i>0;i--)
        {
            num *= i;
        }
        System.out.println("Factorial is "+num);
    }
}
public class Top3BasicAnnotation
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        System.out.println("---\"Top 5 Basic Annotation \"---");

        ImplementsFact IF = new ImplementsFact();
        IF.FindingFact(in.nextInt());

        @SuppressWarnings("unused")
        String bonous = "hi iam bonus annotation";

        in.close();
    }
}