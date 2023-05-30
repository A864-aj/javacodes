//Print the sum of all even & odd numbers in a range seperately.
import java.util.Scanner;
public class Question35 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int range=sc.nextInt();
        int sumEven=0,sumOdd=0;
        for (int i=1;i<=range;i++){
            if(i%2==0){
                sumEven=sumEven+i;
            }
        }
        System.out.println("Sum of all even numbers upto "+range+" is "+sumEven);
        System.out.println("=============================================================");
        for (int i=1;i<=range;i=i+2){
            sumOdd=sumOdd+i;
        }
        System.out.println("Sum of all odd numbers upto "+range+" is "+sumOdd);
    }
}
