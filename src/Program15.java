//Binary search by using methods
public class Program15 {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,80,85,88,100};
        int key=88;
        int high= arr.length-1;
        int low=0;
        int mid=(high+low)/2;
        Program15.binarySearch(arr,high,low,mid,key);
    }
    public static void binarySearch(int arr[],int high,int low,int mid,int key) {
        boolean flag=false;
        int i=0;
        while (flag==false){
            i++;
            if (arr[mid]==key){
                System.out.println(i+" Found at Index: "+mid);
                flag=true;
            } else if (arr[mid]>key) {
                high=mid-1;
                mid=(high+low)/2;
            } else if (arr[mid]<key) {
                low=mid+1;
                mid=(high+low)/2;
            }

        }
    }
}
