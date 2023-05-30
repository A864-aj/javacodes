//Check if a number is X or not. X is the number whole repeated sum of digits is equal to 1
//       Ex- 109 = 1 + 0 + 9 = 10 = 1 + 0 = 1 - Keep adding digits untill it becomes a single digit number
import java.util.*;
public class Question94 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int num=sc.nextInt();
        Question94.xNum(num);
    }

    public static void xNum(int num) {
        int sum=0;
        while (num!=0){
            sum=sum+(num%10);
            num=num/10;
        }if (sum==1){
            System.out.println("Yes");
        } else if (sum>1 && sum<10) {
            System.out.println("No");
        }else
            Question94.xNum(sum);
    }
}
