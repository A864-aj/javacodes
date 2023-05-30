//Print the sum of all factors of a number, 50 - 1 + 2 + 5 + 10 + 25 = 43
import java.util.Scanner;
public class Question38 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int sum=0;
        for(int i=1;i<=num;i++){
            if(num%i==0){
                System.out.print(i+"+");
                sum=sum+i;
            }
        }
        System.out.println("="+sum);
    }
}
