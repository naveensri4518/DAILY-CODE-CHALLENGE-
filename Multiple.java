import java.util.Scanner;

public class Multiple{
    public static void main(String[] args){
        int a ,b ;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b= sc.nextInt();
        if(a % b ==0|| b % a ==0){
            System.out.println("MULTIPLIES");
        }
        else{
            System.out.println("NO MULTIPLES");
        }
    }
}