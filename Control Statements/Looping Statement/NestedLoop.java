public class NestedLoop
{
    public static void main(String[] args)
    {
        int i,j;
        
        System.out.println("---\"Nested Loop\"---");

        for(i = 1;i<10;i++)
        {
            for(j = 0;j<i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }    
}
