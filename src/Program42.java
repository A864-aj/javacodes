//Check if the number is Prime or not.
import java.util.Scanner;
public class Program42 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int counter = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                counter++;
            }

        }if (counter==2){
            System.out.println("Prime");
        }else
            System.out.println("Not Prime");

    }
}