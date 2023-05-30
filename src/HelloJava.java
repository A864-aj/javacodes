import java.util.*;
import java.io.*;

class HelloJava{
    public static void main(String []argh){
//        Scanner in = new Scanner(System.in);
//        int t=in.nextInt();
//        int a,b,n=0,sum=0;
//        String s="",temp="";
//        String arr[]=new String[t];
//        for(int i=0;i<t;i++){
//            a = in.nextInt(); // kya plus hoga
//            b = in.nextInt(); // into hoga
//            n = in.nextInt(); // kab tak hoga
//            sum=a;
//            int k=1;
//            for(int j=1;j<=n;j++){
//                sum=sum+(k*b);
//                s=s+(sum+" ");
//                k=k*2;
//            }
//            temp=s;
//            s="";
//            arr[i]=temp;
//        }
//        for (int i=0;i< arr.length;i++){
//            System.out.println(arr[i]);
//        }
//
 //       in.close();
        int temp=0;
        int arr[]={5,2,7,6,3,8};
//        int arr2[]=new int[arr.length];
        for (int i=0;i< arr.length;i++){
            if (i%2==0){
                if (arr[i]%2!=0){
                    for (int j=i;j< arr.length;j++){
                        if (arr[j]%2==0){
                            temp=arr[i];
                            arr[i]=arr[j];
                            arr[j]=temp;
                            break;
                        }
                    }
                }else{
                    i++;
                }

            }else
                if (arr[i]%2==0){
                    for (int k=i;k< arr.length;k++) {
                        if (arr[k]%2!=0)
                        temp = arr[i];
                        arr[i]=arr[k];
                        arr[k]=temp;
                    }

                }else
                    i++;
        }
        System.out.println(Arrays.toString(arr));
    }
}
