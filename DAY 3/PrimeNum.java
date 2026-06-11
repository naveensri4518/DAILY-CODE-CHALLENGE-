
import java.util.Scanner;

public class PrimeNum{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String snum = sc.nextLine();
        
        int n = Integer.parseInt(snum);
        int flag = 0;
        if(n <= 1){
            flag = 1; }
        else{
            for(int i = 2; i <= n / 2; i++) {
                if(n % i == 0){
                    flag = 1;
                    break;}
            }
        }
        if(flag == 0)
        {
            System.out.println(n);
        }
        else
        {
            System.out.println(-1);
        }

        sc.close();
    }
}
    
