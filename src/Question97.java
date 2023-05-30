import java.util.Arrays;

public class Question97 {
    public static void main(String[] args) {
        int [] nums={0,2,1,5,3,4}; //
        Question97 obj1 =new Question97();
        System.out.println(Arrays.toString(obj1.buildArray(nums)));
    }
    public int[] buildArray(int[] nums) {
        int[] ans =new int[nums.length];
        for(int i=0;i<nums.length;i++){
            ans[i]=nums[nums[i]];
        }
        return ans;
    }
}
