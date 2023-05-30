//Calculate Compound interest
//A=P*(1+R/100)^T
//CI=A-P
import java.util.*;
public class Question16 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter Principle");
        double principle = sc.nextDouble();
        System.out.println("Enter Rate");
        double rate =sc.nextDouble();
        System.out.println("Enter Time");
        double time=sc.nextDouble();

        double amount=principle * Math.pow(1+rate/100 , time);
        double ci= amount-principle;


        System.out.println(ci);
    }
}
