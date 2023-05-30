//Accept a number and check if it is a Harshad number
//      Harshad number is a number or an integer which is completely divisible by sum of  its digits.
//      Ex - 24 = Sum of 2+4 = 6 & 24%6 = 0
import java.util.Scanner;
public class Question47 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number");
        int num=sc.nextInt(),num2=num,sum=0;
        while (num!=0){
            sum=sum+(num%10);
            num /=10;
        }
        System.out.println(num2%sum==0?"Harshad":"Not Harshad");
    }
}
