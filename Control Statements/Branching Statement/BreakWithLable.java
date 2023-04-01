/*using break as lable */

public class BreakWithLable
{
    public static void main(String[] args)
    {
        System.out.println("---\"Break With Lable\"---");

        intiration_1:
        for(int i = 0;i<100;i++)
        {
            for(int j = 0;j<i;j++)
            {
                System.out.print(".");

                if(j==5)
                break intiration_1;//it is terminating outer loop
            }
            System.out.println();
        }
    }    
}