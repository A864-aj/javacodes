//Choice calculator using switch
import java.util.Scanner;
public class Question54 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a,b,c;
        do {
            System.out.println("Choose one of the Operation --");
            System.out.println("1: +");
            System.out.println("2: -");
            System.out.println("3: x");
            System.out.println("4: /");
            System.out.println("0: to EXIT");
            a= sc.nextInt();
            switch(a){
                case 1 ->{
                    System.out.println("Enter 1st Number");
                    b= sc.nextInt();
                    System.out.println("Enter 2nd Number");
                    c= sc.nextInt();
                    System.out.println(b+c);
                }case 2 ->{
                    System.out.println("Enter 1st Number");
                    b= sc.nextInt();
                    System.out.println("Enter 2nd Number");
                    c= sc.nextInt();
                    System.out.println(b-c);
                }case 3 ->{
                    System.out.println("Enter 1st Number");
                    b= sc.nextInt();
                    System.out.println("Enter 2nd Number");
                    c= sc.nextInt();
                    System.out.println(b*c);
                }case 4 ->{
                    System.out.println("Enter 1st Number");
                    b= sc.nextInt();
                    System.out.println("Enter 2nd Number");
                    c= sc.nextInt();
                    System.out.println(b/c);
                }case 0 -> {
                    System.exit(0);
                }
            }
        }while (true);

    }
}
