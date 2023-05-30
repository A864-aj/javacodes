//Median of Array elements.
public class Question92 {
    public static void main(String[] args) {
        int arr[] = {7,8,3,1,2}; //{4} 73128{3} 31278{2} 12378{1} 12378{0}
        double sum; int temp;
       //sorting array
        for (int i=0;i<arr.length;i++){
            for (int j=0;j<arr.length-i-1;j++){
                if (arr[j+1]<arr[j]){
                    int tempo=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=tempo;
                }
            }
        }
        if (arr.length%2==0){
             temp= arr.length/2;
             sum=arr[temp-1]+arr[temp];
             sum=sum/2;
            System.out.println(sum);
        }else{
            temp= arr.length/2;
            temp=temp+1;
            System.out.println(arr[temp-1]);
        }
    }
}
