//Factorial of a number
import java.util.Scanner;
public class Question34 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int fac=sc.nextInt();
        int sum=1;
        for (int i=fac;i>=1;i--){
            sum=sum*i;
        }
        System.out.println(sum);
    }
}
