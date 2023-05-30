//Automorphic number 5 = 25 = 625 = 390625
import java.util.Scanner;
public class Question48Mod {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt(),num2=num,numSq=num*num,sum,rev=0,sum2,rev2=0;
        while (num!=0){//for(int i=1;i<=numSq;i++)
            sum=numSq%10;//5776 % 10
            sum2=num%10;
            rev=(rev*10)+sum;//67
            rev2=(rev2*10)+sum2;
            numSq=numSq/10;
            num /=10;
        }
        if (rev==rev2){
            System.out.println("Automorphic "+num2+" = "+(num2*num2));
        }else
            System.out.println("Not Automorphic "+num2+" = "+(num2*num2));
    }
}
