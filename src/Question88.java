//Binary Search. If element found print the index else -1
public class Question88 {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8,};
        int pivot=0,high= arr.length-1, low=0;
        int num=8;
        boolean flag=false;
        while (flag==false){
            pivot=(high+low)/2;
            if(arr[pivot]==num){
                flag=true;
            }else if (num>arr[pivot]){
                low=pivot+1;
                high= arr.length-1;
                pivot=(high+low)/2;

            }else if (num<arr[pivot]) {
                high=pivot-1;
                low=0;
                pivot=(high+low)/2;
            }
        }
        if (flag==true){
            System.out.println("Element found at "+pivot);
        }else
            System.out.println("Element not found");
    }
}
