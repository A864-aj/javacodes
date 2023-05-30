//Bubble Sort--
import java.util.Arrays;
public class Question91 {
    public static void main(String[] args) {
        int arr[] = {1, -5, 6, -8, -9, -10, 96, 36, -4};
        for (int i=0;i< arr.length-1;i++){
            for (int j=0;j< arr.length-i-1;j++){
                if (arr[j+1]<arr[j]){
                    int temp=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                }

            }
            System.out.println(Arrays.toString(arr));
        }

    }
}
