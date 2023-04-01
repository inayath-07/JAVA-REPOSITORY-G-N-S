class  Implementing implements Runnable
{
    @Override
    public void run()
    {
        System.out.println("I am a basic thread implementing Runnable");
    }
}

public class ImplementingRunnable
{
    public static void main(String[] args)throws InterruptedException
    {
        System.out.println("ImplementingRunnable.main()");

        //syntax to run runnable thread
        Implementing object_name = new Implementing();
        Thread Thread_name = new Thread(object_name);

        Thread_name.start();
        Thread.sleep(1000);

        System.out.println("The state of object_name is "+Thread_name.getState());
    }
}