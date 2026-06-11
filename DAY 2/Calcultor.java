import java.util.*;

public class Calcultor
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        long a = sc.nextLong();
        char op = sc.next().charAt(0);
        long b = sc.nextLong();

        if(op == '+')
            System.out.println(a + b);

        else if(op == '-')
            System.out.println(a - b);

        else if(op == '*')
            System.out.println(a * b);

        else if(op == '/')
            System.out.println(a / b);
    }
}