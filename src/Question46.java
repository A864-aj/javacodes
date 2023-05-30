//Accept a number and check if it is a strong number or not (Sum of factorial of each digit)
//       Ex- 145 = 1! + 4! + 5! = 145

import java.util.Scanner;
public class Question46 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int num2=num,sum,fac=0;
        while (num!=0){
            sum=num%10;
            for (int i=sum-1;i>=1;i--){
                sum=sum*i;
            }
            fac=fac+sum;
            num /=10;
        }
        System.out.println(fac==num2?"yes":"no");
    }
}
