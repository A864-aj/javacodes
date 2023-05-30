//Print hello until user gives wrong input using do while
import java.util.Scanner;
public class Question49 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch;
        do {
            System.out.println("Hello");
            ch = sc.nextLine().charAt(0);
        } while (ch == 'y' || ch == 'Y');
    }
}
