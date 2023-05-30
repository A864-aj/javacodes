public class Question115 {
    public static void main(String[] args) {
        System.out.println(Question115.isHappy(2000));
    }
    public static boolean isHappy(int n) {
        int temp=n,res=0;
        while(n!=1){
            int num=0;
            while(temp!=0){
                int sum=temp%10;
                num=num+(sum*sum);
                temp=temp/10;
                res=num;
            }
            n=res;
            if(n==1){
                return true;
            }else
                temp=res;
        }
        return false;
    }
}
