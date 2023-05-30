//76- Find the second greatest element
//      {2, 96, 69, 77, 145, 20} = Second greatest element = 96

public class Question76 {
    public static void main(String[] args) {
        int[] arr={1,2,8,3,6,4};
        int numFir=arr[0];
        int numSec=arr[1];
        if (numFir<numSec){
            int temp=numFir;
            numFir=numSec;
            numSec=numFir;
        }
        for (int i=2;i< arr.length;i++){
           if (numFir<arr[i]){
               numSec=numFir;
               numFir=arr[i];
           } else if (numFir>arr[i] && numSec<arr[i]) {
               numSec=arr[i];
           }
        }
        System.out.println(numSec);
    }
}
