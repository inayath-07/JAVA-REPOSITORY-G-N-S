import java.util.Scanner;

class ReturningObject
{
    public static Object ObjectReturner(Integer val)
    {
        return val+"\t"+(new StringBuffer("hello"));
    }
}
public class ToReturnObject
{
    public static void main(String[] args)
    {
        Scanner in =new Scanner(System.in);
        System.out.println("---\"The AutoBoxing\"---");
        System.out.println(ReturningObject.ObjectReturner(in.nextInt()));
        in.close();
    }
}