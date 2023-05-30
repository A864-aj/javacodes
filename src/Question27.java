//Accept an english alphabet from user and check if it is a consonent or a vowel;
import java.util.Scanner;
public class Question27 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any Alphabet");
        char ch=sc.nextLine().charAt(0);
        if (ch=='a' || ch=='e' || ch=='o'|| ch=='i'|| ch=='u'){
            System.out.println("Vowel :"+ch);
        }else {
            System.out.println("Consonant :"+ch);
        }
    }
}
