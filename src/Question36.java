//Print all the numbers which are either divisible by 3 or 5 in a range
import java.util.Scanner;
public class Question36 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int range=sc.nextInt();
        for (int i=1;i<=range;i++){
            if ( i%3==0 || i%5==0){
                System.out.println(i);
                }
            }
        }
    }
