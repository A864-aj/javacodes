import java.util.Arrays;

public class Question98 {
    public static void main(String[] args) {
        int nums[]={1,2,3,4,5,10,20,30,40,50}; //[1, 10, 2, 20, 3, 30, 4, 40, 5, 50]
        int n= nums.length/2;
        System.out.println(Arrays.toString(Question98.maiN(nums,n)));
    }

    public static int[] maiN(int nums[], int n) {
        int arr[] =new int[2*n];
        int j=0;
        for (int i=0;i<=(2*n)-2;i=i+2){
            arr[i]=nums[j];
            arr[i+1]=nums[j+n];
            j++;
        }
        return arr;
    }
}
