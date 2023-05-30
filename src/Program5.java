import java.util.Scanner;
public class Program5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your name");
        String name = sc.nextLine();
        // String initials = sc.next();
        System.out.println("Enter your age");
        int age = sc.nextInt();

        System.out.println("My name is "+name+". I am "+age+" years old");
//        char ch ='2';
//        System.out.println(ch);
    }
}
