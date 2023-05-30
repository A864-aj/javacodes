import java.util.Scanner;
public class Question26 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt(),sum,sum2=0,count=0,num2=num;
        while ((num2)!=0){
            count++;
            num2/=10;
        }if (count!=10) {
            System.out.println("Illegal ISBN");
        }
        else {
            for (int i=10;i>=1;i--) {
                    sum = num % 10;
                    sum2 = sum2+(sum*i);
                    num = num / 10;
            }
            System.out.println(sum2);
            if ((sum2)%11==0){
                System.out.println("Legal ISBN "+sum2);
            }else
                System.out.println("Not ISBN");
        }
    }
}
