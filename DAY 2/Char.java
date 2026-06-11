import java.util.*;

public class Char
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        char c = sc.next().charAt(0);
        if(c >= 'A' && c <= 'Z')
            System.out.println((char)(c + 32));
        else if(c >= 'a' && c <= 'z')
            System.out.println((char)(c - 32));
        else
            System.out.println("Not a letter");
        
    }
}