//Find the greatest element and print its index too.
//      {2, 96, 69, 77, 145, 20} = Max element = 145 found at 4 index
import java.util.Scanner;
public class Question74 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr={2,96,69,77,145,20};
        int num=arr[0];
        int index=0;
        for (int i=1;i<arr.length;i++){
            if (arr[i]>num){
                num=arr[i];
                index=i;
            }
        }
        System.out.println(num+" at "+index+" index");

    }
}
