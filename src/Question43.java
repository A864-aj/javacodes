//Accept a number and print its reverse
import java.util.Scanner;
public class Question43 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number");
        int num=sc.nextInt();
        while (num!=0){
            System.out.print(num%10);
            num /=10;
//            while (num!=0){       ##Different method which stores the value also
//                x=num%10;
//                num=num/10;
//                y=(y*10)+x;
//            }
        }
    }
}
