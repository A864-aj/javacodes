//Write a program to print the sum of negative numbers, sum of positive even numbers and the sum of positive odd numbers
//       from a list of numbers (N) entered by the user.
//       The list terminates when the user enters a zero.
import java.util.Scanner;
public class Question51 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a,sumNeg=0,sumPosEve=0,sumPosOdd=0;
        do {
            System.out.println("Enter Number");
            a= sc.nextInt();
            if (a<0){
                sumNeg=sumNeg+a;
            }if (a>0){
                if (a%2==0){
                    sumPosEve=sumPosEve+a;
                }else {
                    sumPosOdd=sumPosOdd+a;
                }
            }
        }while(a!=0);
        System.out.println("Negative = "+sumNeg);
        System.out.println("Positive Even ="+sumPosEve);
        System.out.println("Positive odd ="+sumPosOdd);
    }
}
