//Seprate each digit of a number and print it on the new line
import java.util.Scanner;
public class Question40 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Number");
        int a=sc.nextInt();
        int b;
        while(a!=0){ //jabtak a ki value 0 ke equal nhi hai ,tab tak chalao
            b=a%10;
            System.out.println(b);
            a=a/10;
        }

    }
}
//32=space
//48=0