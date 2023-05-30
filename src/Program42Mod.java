//Check if the number is Prime or not.
import java.util.Scanner;
public class Program42Mod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (num == 1 || num==0)
            System.out.println("noT prime");
        else if (num == 2)
            System.out.println("prime");
        else if (num > 2 && num % 2 == 0)
            System.out.println("nOt prime");
        else {
            boolean isPrime=true;
            int loop=0;
            for (int i = 3; i <= Math.sqrt(num); i += 2) {
                System.out.println(i);
                if (num % i == 0) {
                    isPrime=false;
                    break;
                }
            }
            System.out.println(isPrime?"Prime":"NOT Prime");
        }

    }
}