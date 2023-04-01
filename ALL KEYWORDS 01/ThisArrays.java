/* This program will show the use of this keyword with respect 
 * to instance variable
*/
public class ThisArrays
{
    String args[] = {"Syed","Shah", "Inayath", "Ullah", "Quadri"};

    public void mainLogic(String args[])
    {
        System.out.println("---\"ThisKeyword01.main()\"---");

        //declaration of variable
        int i = 1;
        System.out.println("from commandLine");
        for(String x:args)
        {
            System.out.println("The "+i+" String is "+x);
            i++;
        }

        System.out.println("------------------");

        System.out.println("Refering to instance args");
        for(String x:this.args)
        {
            System.out.println("The "+i+" String is "+x);
            i++;
        }
    }

    public static void main(String[] args)
    {
        ThisArrays TK1 = new ThisArrays();
        TK1.mainLogic(args);        
    }
}