package Hash;

/**
 * @Author yyzhou
 * @Date 2024/6/17 22:53
 * @PackageName:Hash
 * @ClassName: sumTwoNumbers
 * @Description: TODO
 * @Version 1.0
 */
public class sumTwoNumbers {
        public int[] twoSum(int[] nums, int target) {
            int result[]=new int[2];
            for(int i=0;i<nums.length-1;i++){
                for(int j=i+1;j<nums.length;j++){
                    if(nums[i]+nums[j]==target){
                        result[0]=i;
                        result[1]=j;
                        return result;
                    }
                }
            }
            return result;
        }
}
