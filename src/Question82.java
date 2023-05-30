//(QUE-83)Array right rotation by K elements

//(QUE -84 )Can you Do it in O(n) ?
import java.util.Arrays;
import java.util.Scanner;
public class Question82 {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        if (n>arr.length){
            n=n% arr.length;
        }
        for (int k=1;k<=n;k++){
            int temp=arr[arr.length-1];
            for (int i=arr.length-1;i>0;i--){
                arr[i]=arr[i-1];

            } arr[0]=temp;

        }
        System.out.println(Arrays.toString(arr));
    }
}