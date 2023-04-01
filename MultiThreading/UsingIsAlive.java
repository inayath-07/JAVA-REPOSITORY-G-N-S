/*Program to demonstrate isAlive() 
 * 
 * isAlive() --> to check if the thread is still in RUNNABLE state
*/
public class UsingIsAlive
{
    public static void main(String[] args)throws InterruptedException
    {
        System.out.println("---\"UsingIsAliveAndJoin.main()\"---");

        Extending E = new Extending();
        E.start();
        E.setName("Extend Thread");
        
        System.out.println("Is the Thread "+E.getName()+" still running "+E.isAlive());
    }    
}