//Mean of array elements.
import java.util.Scanner;
public class Question73 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n= sc.nextInt();
        int arr[]=new int[n];
        int sum=0;
        for (int i=0;i< arr.length;i++){
            arr[i]=sc.nextInt();
            sum=sum+arr[i];
        }
        System.out.print("Mean of Array Elements = "+(double)sum/n);
    }
}
