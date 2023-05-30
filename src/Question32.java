// Take a number as input and print its table
//       5 * 1 = 5
//       5 * 2 = 10 ... up to 10 terms
import java.util.Scanner;
public class Question32 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int table=sc.nextInt();
        for (int i=1;i<=10;i++){
            int res=table*i;
            System.out.println(table+" x "+i+" = "+res);
        }
    }
}
