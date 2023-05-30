import java.util.Scanner;

public class Program12 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
    //Three ways to declare an array --
        int[] arr={1,2,3,4,5};
        int[] arr2=new int[5];
        int[] arr3=new int[]{1,2,3,4,6};

        for (int i=0;i<arr2.length;i++){
            arr2[i]=sc.nextInt();
        }
        for (int i=0;i<arr2.length;i++){
            //System.out.print(arr[i]);
            System.out.print(arr2[i]+" ");
            //System.out.println(arr3[i]);
        }

    }
}
