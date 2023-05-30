import java.util.Arrays;

public class Question84 {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int temp[]=new int[arr.length];
        int rot=1;int j=0;
        if (rot> arr.length) {
            rot = rot % arr.length;
        }
        else if (rot== arr.length)
        {
                System.out.println(Arrays.toString(arr));
        }
        else if (rot==1)
        {
            temp[0]=arr[arr.length-1];
            for (int i =1;i<arr.length;i++){
                temp[i]=arr[i-1];}

                System.out.println(Arrays.toString(temp));
        }else{
            for (int i = arr.length-rot;i< arr.length;i++){
                temp[j]=arr[i];
                j++;
            }
            for (int k=0;k< arr.length-rot;k++){
                temp[j]=arr[k];
                j++;
            }
        }
    }
}
