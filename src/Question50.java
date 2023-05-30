//Make a choice based calculator using do while
import java.util.Scanner;
public class Question50 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a,b;
        int c;
        do {
            System.out.println("Choose one of the Operation --");
            System.out.println("1: +");
            System.out.println("2: -");
            System.out.println("3: x");
            System.out.println("4: /");
            System.out.println("0: to EXIT");
            c=sc.nextInt();
            if (c==1){
                System.out.println("Enter 1st No.");
                a=sc.nextInt();
                System.out.println("Enter second No.");
                b= sc.nextInt();
                System.out.println(a+b);
            }else if (c==2) {
                System.out.println("Enter 1st No.");
                a=sc.nextInt();
                System.out.println("Enter second No.");
                b= sc.nextInt();
                System.out.println(a-b);
            }else if (c==3) {
                System.out.println("Enter 1st No.");
                a=sc.nextInt();
                System.out.println("Enter second No.");
                b= sc.nextInt();
                System.out.println(a*b);
            }else if (c==4) {
                System.out.println("Enter 1st No.");
                a=sc.nextInt();
                System.out.println("Enter second No.");
                b= sc.nextInt();
                System.out.println(a/b);
            } else if (c==0) {
                System.exit(0);
            }else
                System.exit(0);
        }while(true);
    }
}