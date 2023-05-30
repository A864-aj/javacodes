import java.util.Scanner;
public class Question15 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your Name");
        String name=sc.nextLine();
        System.out.println("Enter your age");
        int age =sc.nextInt();
        if(age==18 || age>18){
            System.out.println("Hello "+name+" you are eligible to vote");
        }else{
            int eligiblity = 18-age;
            System.out.println("Hello "+name+" You will be eligible to vote after "+eligiblity+" years");
        }

    }
}
