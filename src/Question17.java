//Area of Traingle using herons formula
//s=a+b+c/2
//A= √s*(s-a)*(s-b)*(s-c)
import java.util.Scanner;
public class Question17 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter side 1");
        double a=sc.nextDouble();
        System.out.println("Enter side 2");
        double b=sc.nextDouble();
        System.out.println("Enter side 3");
        double c=sc.nextDouble();

        double s=(a+b+c)/2;
        double area= Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.println(area);
    }
}
