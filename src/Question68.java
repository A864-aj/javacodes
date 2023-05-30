//Take two number as inputs and find their HCF
import java.util.Scanner;
public class Question68 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num1=sc.nextInt();
        int num2= sc.nextInt();
        for (int i=Math.min(num1,num2);i>=1;i--){
            if (num1%i==0 && num2%i==0){
                System.out.println(i);
                break;
            }
        }

    }
}
