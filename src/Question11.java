import java.util.Scanner;
public class Question11 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        if(a>b){
            System.out.println(a+" is greater");
        }else if(a==b) {
            System.out.println("Both are equal");
        }else{
            System.out.println("B is greator");
        }
    }
}
