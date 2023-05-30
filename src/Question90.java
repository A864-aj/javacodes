//90- Move all the negative elements on left side
// and positive elements on right side without extra space in O(n)
import java.util.Arrays;

public class Question90 {
    public static void main(String[] args) {
        int arr[]={1,-5,6,-8,-9,-10,96,36,-4};
        int temp, front=0,back= arr.length-1;
        while (front<back){
            if (arr[front]>0 && arr[back]<0) {
                temp=arr[back];
                arr[back]=arr[front];
                arr[front]=temp;
                front++;
                back--;

            }else if (arr[front]<0 && arr[back]<0) {
                front++;
            }else{
                back--;
            }

        }
        System.out.println(Arrays.toString(arr));
    }
}

