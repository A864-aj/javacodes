//Linear Search an array - If element found print the index else -1

public class Question87 {
    public static void main(String[] args) {
        int arr[]={2,4,1,33,42,7};
        int num=41,index=0;
        boolean flag=false;
        for (int i=0;i< arr.length;i++){
            if (arr[i]==num){
                index=i;
                flag=true;
                break;
            }
        }
        if (flag==true){
            System.out.println("Element found at index = "+index);
        }else
            System.out.println("Element not found ");
    }
}
