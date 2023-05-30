//Find the smallest element and print its index too.
//      {2, 96, 69, 77, 145, 20} = Min element = 2 found at 0 index

public class Question75 {
    public static void main(String[] args) {
        int arr[]={2, 96, 69, 1, 145, 20};
        int num=arr[0];
        int index=0;
        for (int i=1;i< arr.length;i++){
            if (num>arr[i]){
                num=arr[i];
                index=i;
            }
        }
        System.out.println(num +" at index "+index);
    }
}