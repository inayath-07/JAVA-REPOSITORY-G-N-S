/*Constinue with outer lable */
public class ContinueWithLable
{
    public static void main(String[] args)
    {
        System.out.println("---\"Continue with lable\"---");

        L1:
        for(int i = 0;i<10;i++)
        {
            for(int j = 0;j<i;)
            {
                System.out.print("~");
                continue L1;
            }
            System.out.println();
        }
    }    
}