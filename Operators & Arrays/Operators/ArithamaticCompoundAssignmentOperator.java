/*here we will play with characters with the help of Compound Assignment */

public class ArithamaticCompoundAssignmentOperator
{
    public static void main(String[] args)
    {
        System.out.println("---\"ArithamaticCompoundAssignmentOperator\"---");
        char exp = (char)(Math.random()*128);
        char exp2 = (char)(Math.random()*128);

        //lets play
        System.out.println(exp);
        exp += exp2;
        System.out.println("Ater playing 1 time-- "+exp);

        exp -=exp2;
        System.out.println("Ater playing 2nd time "+exp);

        exp *=exp2;
        System.out.println("Ater playing 3rd time "+exp);

        exp /= exp2;
        System.out.println("Ater playing 4th time "+exp);

        exp %= exp2;
        System.out.println("After playing 5th time "+exp);
        
        /*-------------------------------------------*/

        System.out.println("--- Playing with exp2 ---");

        System.out.println(exp);
        exp2 += exp;
        System.out.println("Ater playing 1 time-- "+exp2);

        exp2 -= exp;
        System.out.println("Ater playing 2nd time "+exp2);

        exp2 *= exp;
        System.out.println("Ater playing 3rd time "+exp2);

        exp2 /= exp;
        System.out.println("Ater playing 4th time "+exp2);

        exp2 %= exp;
        System.out.println("After playing 5th time "+exp2);
        
    }
}