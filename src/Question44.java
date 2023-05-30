//Accept a number and check if it is a pallindromic number (If number and its reverse are equal)
//       Ex - 12321 - Rerverse - 12321
import java.util.Scanner;
public class Question44 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number");
        int num=sc.nextInt();
        int num1=num;
        int x,y=0;
        while (num!=0){
            x=num%10;
            y=(y*10)+x;
            num=num/10;

        }if (num1==y)
            System.out.println("Palindrome");
        else
            System.out.println("Not Palidrome"+y);
    }
}
