//Find the LCM of two numbers
import java.util.Scanner;
public class Question69 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        int j=2;
        for (int i=Math.max(num1,num2);i<=num1*num2; i=i * j++){
            System.out.println(i);
            if (i%num1==0 && i%num2==0){
                System.out.println("LCM - "+i);
                break;
            }
        }
    }
}
