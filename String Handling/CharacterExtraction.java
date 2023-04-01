/*This program is use to Extract character from string 
 * note byte
*/

class ExtractingChar
{
    String string = new String("Inayath");
    char[] buf = new char[10];
    byte[] byte_buf = new byte[10];
    char[] char_array = new char[10];

    void CharacterExtractor()
    {
        System.out.println("using chatAt(index) "+string.charAt((int)Math.random()*7));
        System.out.print("using getChars(start,end) ");

        string.getChars(1,3,buf,0);
        string.getBytes(1,5,byte_buf,0);
        char_array = string.toCharArray();

        System.out.println(buf);
        for (int i = 0; i < byte_buf.length;)
        {
            System.out.println(byte_buf[i]);

            System.out.println("Converting String to char array usig toCharArray() "+char_array[i]);
            break;
        }
    }
}
public class CharacterExtraction
{
    public static void main(String[] args)
    {
        System.out.println("---\"CharacterExtraction.main()\"---");
        ExtractingChar EC = new ExtractingChar();
        EC.CharacterExtractor();
    }
}