import java.util.Scanner;

public class Question64 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        for (int k=1;k<=n;k++){

            for (int j=1;j<=n-k;j++)
            {
                System.out.print(" ");
            }

            for (int i=1;i<=k;i++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i=1;i<=n;i++){

            for (int j=1;j<=i;j++)
            {
                System.out.print(" ");
            }

            for (int k=1;k<=n-i;k++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
