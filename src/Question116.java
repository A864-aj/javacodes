import java.util.*;
public class Question116 {
    public static void main(String[] args) {

        System.out.println(Question116.selfDividingNumbers(1,22));
    }
    public static List<Integer> selfDividingNumbers(int left, int right) {
        ArrayList<Integer> arr=new ArrayList<Integer>();
        for(int i=left;i<=right;i++){
            int num=i; int count=0;
            while (num!=0){
                int sum=num%10;
                if (sum==0){
                    count=0;
                    num=0;
                } else if (sum>0) {
                    if (i%sum==0){
                        count++;
                        num=num/10;
                    }else{
                        num=0;
                        count=0;
                    }
                }
            }
            if (count>0){
                arr.add(i);
            }
        }
        return arr;
    }
}
