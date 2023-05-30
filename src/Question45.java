//Accept a number and check if it is a armstrong number (Sum of cube of all digits will be equal to origional number)
//       Ex - 407 = 64 + 0 + 343 = 407
//              153 = 1 + 125 + 27 = 153
import java.util.Scanner;
public class Question45 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int num2=num;
        int sum=0;
        while (num!=0){
            int a=num%10;
            sum=sum+(a*a*a);
            num /=10;
       }
        System.out.println(sum==num2?"Armstrong":"Not Armstrong");
    }
}
