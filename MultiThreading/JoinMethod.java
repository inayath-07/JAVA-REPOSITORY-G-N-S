/*the following program is use to demonstrte join()
 * 
 * join() --> if the thread is .join() then all the thread are put into
 * waiting state and no inturupt is generated
*/

class DemonstrateJoinMethod extends Thread
{
    @Override
    public void run()
    {
        String name = Thread.currentThread().getName();
        for(int i = 0;i<3;i++)
        {
            System.out.println(name);
        }
        System.out.println("-------");
    }
}
public class JoinMethod
{
    public static void main(String[] args)throws InterruptedException
    {
        System.out.println("---\"JoinMethod.main()\"---");

        DemonstrateJoinMethod DJM1 = new DemonstrateJoinMethod();
        DemonstrateJoinMethod DJM2 = new DemonstrateJoinMethod();
        DemonstrateJoinMethod DJM3 = new DemonstrateJoinMethod();

        /*DJM1.start();
        DJM2.start();
        DJM3.start();*/

        /*no iturupte is generates  --> if you want to see 
        * difference commentes  following block and execute 
        * above commented block
        */
        DJM1.start();

        DJM1.join(100);

        DJM2.start();
        DJM3.start();
    }
}