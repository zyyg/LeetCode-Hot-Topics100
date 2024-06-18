package Hash;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @Author yyzhou
 * @Date 2024/6/18 15:11
 * @PackageName:Hash
 * @ClassName: Code128
 * @Description: 给定一个未排序的整数数组 nums ，找出数字连续的最长序列（不要求序列元素在原数组中连续）的长度。
 * @Version 1.0
 */
public class Code128 {
    public int longestConsecutive(int[] nums) {
        if (nums.length==0){
            return 0;
        }
        Arrays.sort(nums);
        int max=1;
        int count=1;
        for (int i=1;i<nums.length;i++) {
            int temp=nums[i-1]+1;
            if (nums[i]==temp){
                count+=1;
            }
            if(nums[i]>temp){
              if (count>max){
                  max=count;
              }
              count=1;
            }

        }
        if (count>max){
            max=count;
        }
        return max;
    }

    public static void main(String[] args) {
        Code128 code128=new Code128();
        int[] nums=new int[]{9,1,4,7,3,-1,0,5,8,-1,6};
        int result=code128.longestConsecutive(nums);
        System.out.println(result);
    }
}
