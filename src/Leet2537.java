import java.util.Arrays;

class Leet2537 {
    public static void main(String[] args) {
        int[] nums={1,5,0,3,5};
        int countZer=0;
        int num=nums[0];
        int count=0;
        while(countZer!=5){
            for(int j=0;j<nums.length;j++){
                if (nums[j]==0){
                    countZer++;
                }
                for(int i=0;i<nums.length;i++)
                {
                    if(nums[i]<num && nums[i]!=0){
                        num=nums[i];
                    }
                }
                if(nums[j]!=0){
                    int temp=nums[j];
                    nums[j]=temp-num;
                }
                System.out.println(Arrays.toString(nums));
            }
            count++;
        }
        System.out.println(count);
    }
}
//class Solution {
//    public int minimumOperations(int[] nums) {
//        // int countZer=0;
//        // int num=nums[0];
//        // int count=0;
//        // while(countZer!=nums.length){
//        //       for(int i=0;i<nums.length;i++)
//        //         {
//        //             if(nums[i]<num && nums[i]!=0){
//        //                 num=nums[i];
//        //             }
//        //         }
//        //     for(int j=0;j<nums.length;j++){
//        //         if(nums[j]!=0){
//        //             int temp=nums[j];
//        //             nums[j]=temp-num;
//        //         }else
//        //             countZer++;
//        //     }
//        //     count++;
//        // }
//        // return count;
//        int count=0;
//        while(checkNonZero(nums)){
//            int smallest=findSmallest(nums);
//            for(int i=0;i<nums.length;i++){
//                if(nums[i]!=0){
//                    nums[i]=nums[i]-smallest;
//                }
//            }
//            count++;
//        }
//        return count;
//    }
//    public static int findSmallest(int []temp){
//        int small=Integer.MAX_VALUE;
//        for(int i=0;i<temp.length;i++){
//            if(temp[i]!=0){
//                if(small>temp[i]){
//                small=temp[i];
//            }
//            }
//
//        }
//        return small;
//    }
//    public static boolean checkNonZero(int[] arr){
//        for(int i=0;i<arr.length;i++){
//            if(arr[i]!=0){
//                return true;
//            }
//        }
//        return false;
//    }
//}