//Accept the integer and print hello world n times
import java.util.Scanner;
public class Question29 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            System.out.println("Hello world");
        }
    }
}
//Types of Loops
/*
1) Entry Control
    --For and While
2) Exit Control
    --Do while
 */