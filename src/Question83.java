import java.util.Arrays;

public class Question83 {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int temp[]=new int[arr.length];
        int rot=1;
        if (rot> arr.length){
            rot=rot% arr.length;
            if (rot== arr.length){
                System.out.println(Arrays.toString(arr));
            }else {
                int j=0;
                for (int i =rot;i<arr.length;i++){
                    temp[j]=arr[i];
                    j++;
                }
                for (int k=0;k<rot;k++){
                    temp[j]=arr[k];
                    j++;
                }
                System.out.println(Arrays.toString(temp));
            }
        }
    }
}
