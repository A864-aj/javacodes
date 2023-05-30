import java.util.Scanner;

public class Strong {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int num=sc.nextInt();
        int x=num;
        int total=0;
        int fact=1;
        while (num!=0){
            int num1 =num%10;
            for (int i=num1;i>=1;i--){
                fact=fact*i;
            }
            total=total+fact;
            fact=1;
            num=num/10;
        }
        if (total==x){
            System.out.println("Yes");
        }else {
            System.out.println("No");
            System.out.println(total);
        }
    }
}
