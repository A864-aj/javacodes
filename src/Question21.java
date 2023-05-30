//Leap Year
import java.util.Scanner;
public class Question21 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter year");
        int year=sc.nextInt();
        if (year%100==0){          //Checking century year
            if (year%400==0){      //checking if it is century year it is also a leap year
                System.out.println("Leap year");
            }else {
                System.out.println("Not leap year");
            }
        } else if (year%4==0) {    //checking non century year is a leap year or not
            System.out.println("Leap year");
        }else {
            System.out.println("Not a leap year");
        }

    }
}
