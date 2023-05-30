//Temperature conversion
import java.util.Scanner;
public class Question8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Temperature in fahrenheit");
        float far =sc.nextFloat();
        float celsius =((far-32)*5)/9;

        System.out.println("Temperature in celsius is "+celsius);
    }
}
