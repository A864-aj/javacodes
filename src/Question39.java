// Accept a number and check if it a perfect number or not.
//      A number whose sum of factors(excluding number itself)  = Number
//      Ex -  6 = 1, 2, 3 = 6
import java.util.Scanner;
public class Question39 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int sum=0;
        for(int i=1;i<num;i++){
            if(num%i==0){
                sum=sum+i;
            }
        }if(sum==num){
            System.out.println("Perfect");
        }else {
            System.out.println("not perfect");
        }
    }
}
