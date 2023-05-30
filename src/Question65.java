import java.util.Scanner;

public class Question65 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int x=n;
        for (int i=1;i<=n;i++){

            for (int j=1;j<=i-1;j++)
            {
                System.out.print(" ");
            }
            System.out.print("* ");
            for (int k=x-1;k>=1;k=k-1)
            {
                System.out.print("  ");
            }
            System.out.println("*");
            x--;
        }
        for (int i=1;i<=n-1;i++){
            System.out.print(" ");
        }
        System.out.println(" *");
    }
}
