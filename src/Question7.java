import java.util.Scanner;
public class Question7 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Marks of Maths");
        float maths =sc.nextFloat();
        System.out.println("Enter Marks of Computer");
        float computer =sc.nextFloat();
        System.out.println("Enter Marks of English");
        float english = sc.nextFloat();

        float per =(maths+english+computer)/3;
        System.out.println("you got "+per+"%");
    }
}
