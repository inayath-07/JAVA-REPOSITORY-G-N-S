//This program demonstrate inner Lable through continue
public class ContinueWithLable2
{
    public static void main(String[] args)
    {
        System.out.println("---\"Continue With Lable Part 2\"---");

        for(int i = 0;i<10;i++)
        {
            L:
            for(int j = i;j<10;j++)
            {
                if(j%2==0)
                continue L;

                System.out.print(".");
            }
            System.out.println();
        }
    }
}