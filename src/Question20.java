import java.util.Scanner;
public class Question20 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();

        if (a>b && a>c){
            System.out.println("a is greater");
        } else if (b>a && b>c) {
            System.out.println("B is greater");
        }else if (c>a && c>b){
            System.out.println("C is greater");
        }else if(a==b && a>c){
            System.out.println("A and B are equal and greater");
        } else if (a==c && a>b) {
            System.out.println("A and C are equal and greater");
        } else if (b==c && b>a) {
            System.out.println("B and C are equal and greater");
        }else{
            System.out.println("All are equal");
        }
    }
}
