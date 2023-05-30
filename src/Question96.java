import java.util.Arrays;
public class Question96 {
    public int[] getConcatenation(int[] nums) {
        int n=nums.length;
        int[] ans=new int[2*n];
        for(int i=0;i<nums.length;i++){
            ans[i]=nums[i];
            ans[i+n]=nums[i];
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] nums={1,2,1};
       Question96 q1=new Question96();
       System.out.println(Arrays.toString(q1.getConcatenation(nums)));
    }
}
