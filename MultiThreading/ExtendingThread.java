class Extending extends Thread
{
    @Override
    public void run()
    {
        System.out.println("I am a basic thread using superclass Thread");
    }
}
public class ExtendingThread
{
    public static void main(String[] args)throws InterruptedException
    {
        System.out.println("ExtendingThread.main()");
        Extending E = new Extending();
        E.start(); // starting The Thread
        
        System.out.println("getting the state of the thread ");
        Thread.sleep(1000);
        System.out.println("The state of Thread is "+E.getState());
    }
}