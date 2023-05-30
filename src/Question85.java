//Pallindromic array - Write a program to check if elements of an array are same or not it read from front or back
//      Example : arr= [2,3,15,15,3,2]
public class Question85 {
    public static void main(String[] args) {
        int arr[]={2,5,15,3,2};
        int pivot= arr.length-1;
        boolean flag=true;
        for (int i=0;i< arr.length/2;i++){
            if (arr[i]==arr[pivot]){
                pivot--;
            }else{
                flag=false;
            }
        }
        System.out.println(flag?"yes":"no");
    }
}
