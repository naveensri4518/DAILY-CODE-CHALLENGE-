import java.util.*;

public class Twonumbers
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        double a = sc.nextDouble();
        double b = sc.nextDouble();
        System.out.println("FLOOR  " + (int)a +" / " + (int)b + " = "  +(long)Math.floor(a/b));
            System.out.println("CEIL  " + (int)a +" / " + (int)b + " = " +(long)Math.ceil(a/b));
                System.out.println("ROUND  " + (int)a +" / " + (int)b + " = " +(long)Math.round(a/b));
    }
}