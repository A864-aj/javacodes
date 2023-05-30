//Choice based weekday
import java.util.Scanner;
public class Question52 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int day;
        do {
            System.out.println("Enter Day 1 to 7 and 0 to Exit");
            day=sc.nextInt();
            switch (day){
                case 1 -> {
                    System.out.println("monday");
                }case 2 -> {
                    System.out.println("Tuesday");
                }case 3 -> {
                    System.out.println("Wednesday");
                }case 4 -> {
                    System.out.println("Thursday");
                }case 5 -> {
                    System.out.println("Friday");
                }case 6 -> {
                    System.out.println("Saturday");
                }case 7 -> {
                    System.out.println("Sunday");
                }case 0 -> {
                    System.exit(0);
                }
            }
        }while (true);

    }
}
