class Modifier
{
    void modifier()
    {
        System.out.println("The subString() of Inayath is "+"Inayath".substring(2));
        System.out.println("Concating two String "+"Inayath ".concat(" ullah"));
        System.out.println("replace() "+"INAYATH".replace('i', 'i'));
        System.out.println("Changing the case to upper toUpperCase() "+"inayath".toUpperCase());
        System.out.println("Changing the case to lower toLowerCase() "+"".toLowerCase());
        System.out.println("Joining more than one String using join() "+String.join("Inayath ","ullah"," ","quadri"));
    }
}
public class StrignModifier
{
    public static void main(String[] args)
    {
        System.out.println("---\"StrignModifier.main()\"---");
        Modifier M = new Modifier();
        M.modifier();
    }    
}