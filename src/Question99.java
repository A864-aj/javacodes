public class Question99 {

    public int numIdenticalPairs(int[] nums) {
        int count=0;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    count++;
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int nums[]={1,2,1,3,2,4,3,};
        System.out.println();
        Question99 ob1 =new Question99();

        System.out.println(ob1.numIdenticalPairs(nums));
    }
}
