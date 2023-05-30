//(QUE -81)Array left rotation by K elements
//
//(QUE -82 )Can you Do it in O(n) ?
import java.util.Arrays;
import java.util.Scanner;
public class Question81 {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        Scanner sc = new Scanner(System.in);
       int n=sc.nextInt();
       if (n>arr.length){
           n=n% arr.length;
       }
        for (int k=1;k<=n;k++){
            int temp=arr[0];
            for (int i=1;i<arr.length;i++){
                arr[i-1]=arr[i];
            } arr[arr.length-1]=temp;

        }
        System.out.println(Arrays.toString(arr));
    }
}
