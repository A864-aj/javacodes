//Accept size n from user and create a n size array then take n inputs into the array and finally
//        Print the sum of all elements in the array in the following manner
//        10 + 20 + 30 = 60
import java.util.Scanner;

public class Question72 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n= sc.nextInt();
        int arr[]=new int[n];
        int sum=0;
        for (int i=0;i< arr.length;i++){
            arr[i]=sc.nextInt();
            sum=sum+arr[i];
        }
        for (int i=0;i< arr.length;i++){
            System.out.print(arr[i]+" + ");
        }
        System.out.print(" = "+sum);
    }
}
