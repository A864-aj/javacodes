//Move all the negative elements on left side
// and positive elements on right side with extra space in O(n).
import java.util.Arrays;
public class Question89 {
    public static void main(String[] args) {
        int arr[]={1,-5,6,-8,-9,-10,96,36,-4};
        int temp[]=new int[arr.length];
        int j=0;
        for (int a:arr){
            if (a<0)
            temp[j++]=a;
        }
        for (int a:arr){
            if (a>0)
                temp[j++]=a;
        }
        System.out.println(Arrays.toString(temp));
    }
}
