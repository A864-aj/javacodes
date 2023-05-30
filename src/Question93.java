import java.util.Scanner;

//Accept a number and check if it is a strong number or not (Sum of factorial of each digit)
//       Ex- 145 = 1! + 4! + 5! = 145
public class Question93 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        Question93.strongNum(num);
    }

    public static void strongNum(int num) {
        int numTwo=num;
        int sum2=0;
        while (numTwo!=0){
            int sum=numTwo%10;
            int res=1;
            for (int i=sum;i>=1;i--){
                res=res*i;
            }
            sum2=sum2+res;
            numTwo=numTwo/10;
        }
//        if (sum2==num){
//            System.out.println(sum2+" Strong");
//        }
//        else
//            System.out.println(sum2+" Not");
        System.out.println(sum2==num?"Strong":"Not");
    }
}
