//Question no. 5
import java.util.Scanner;
public class Program6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length");
        int length =sc.nextInt();
        System.out.println("Enter the breadth");
        int breadth = sc.nextInt();

        int area = length*breadth;
        int perimeter = 2*(length+breadth);

        System.out.println("Area of Rectanle is "+area);
        System.out.println("Perimeter of Rectangle is "+perimeter);
    }
}
