//78- Array Reverse Using Extra space
import java.util.Arrays;
import java.util.Scanner;
public class Question78 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int[] arr= {1,2,3,4,5};
        int[] arr2=new int[arr.length];
        int count= arr.length-1;
        for (int i=0;i<arr.length;i++){
            arr2[i]=arr[count--];
        }
        System.out.println(Arrays.toString(arr2));
    }
}
