/*Program to demonstrate Context Swtich that is switching from one
 * Thread to another using setPriority()
*/
public class ContextSwitch
{
    public static void main(String[] args)
    {
        System.out.println("---\"ContextSwitch.main()\"---");

        //Creating object of Extending class
        Extending E = new Extending();
        System.out.println("The priority of "+E.getClass()+" is "+E.getPriority());
        E.setPriority(5);//changing priority

        //Creating object of Implementing class
        Implementing I = new Implementing();
        Thread T = new Thread(I);
        System.out.println("The priority of "+I.getClass()+" is "+T.getPriority());

        T.setPriority(5);//changing priority

        System.out.println();

        //example of ContextSwitch
        if(E.getPriority()==T.getPriority())
        {
            System.out.println("Both Thread will run parallely");
        }
        else
        {
            E.start();
            T.start();
        }

        System.out.println("Is the Thread "+E+" is stoped "+E.isInterrupted());
        System.out.println("Is the Thread "+T+" is stoped "+T.isInterrupted());
    }
}