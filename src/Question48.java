//Automorphic number 5 = 25 = 625 = 390625
import java.util.Scanner;
public class Question48 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt(),num2=num,numSq=num*num,sum=0,rev=0,revSum=0;
        while (num!=0){//for(int i=1;i<=numSq;i++)
            sum=numSq%10;//5776 % 10
            rev=(rev*10)+sum;//67
            numSq=numSq/10;
            num /=10;
        }while (rev!=0){
            sum=rev%10;
            revSum=(revSum*10)+sum;
            rev /=10;
        }
        if (revSum==num2){
            System.out.println("Automorphic "+num2+" = "+(num2*num2));
        }else
            System.out.println("Not Automorphic "+revSum+" "+num2*num2);
    }
}
