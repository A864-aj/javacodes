public class Question100 {
    public static void main(String[] args) {
        int arr[]={0,2,4,2,0};
        Question100 obj1 =new Question100();
        System.out.println(obj1.peakIndexInMountainArray(arr));
    }
    public int peakIndexInMountainArray(int[] arr) {
        int i=0,j=1;
        while(arr[i]<arr[j]){
            i++;
            j++;
        }
        return i;
    }
}
// int num=arr[0]; int index=0;
// for(int i=1;i<arr.length;i++){
//     if(arr[i]>num){
//         num=arr[i];
//         index=i;
//     }
// }
// return index;