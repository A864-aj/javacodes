//77- Check if array is sorted or not.

public class Question77 {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        int count=0;
        for (int i=1;i<arr.length;i++){
            if (arr[i-1]<arr[i]) {
                count++;
            }
        }
        if (count>0){
            System.out.println("Sorted");
        }else {
            System.out.println("Not sorted");
        }
    }
}
