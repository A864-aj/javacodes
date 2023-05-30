import java.util.Scanner;

public class Question12_13 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Gender M/F");
        char gender=sc.next().charAt(0);
        if(gender=='M'|| gender=='m')
        {
            System.out.println("Good Morning Sir");
        }else if(gender=='F'|| gender=='f'){
            System.out.println("Good Morning Madam");
        }else{
            System.out.println("Invalid Input");
        }
    }
}
