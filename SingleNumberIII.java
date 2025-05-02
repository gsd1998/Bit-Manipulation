package interviewQA.BitManipulation;

import java.util.ArrayList;
import java.util.List;

public class SingleNumberIII {
    public static void main(String[] args) {
        int[] nums = {5,5,7,4,4,11,9,9};
        List<Integer> result = singleNumber(nums);
        System.out.println(result);
    }
    public static List<Integer> singleNumber(int[] nums) {
        int xorr = 0;
        int rightMostBitSet = 0;
        List<Integer> ans = new ArrayList<>();
        for(int i = 0; i <= nums.length-1; i++){
            xorr = xorr^nums[i];
        }
        int b1 = 0;
        int b2 = 0;
        rightMostBitSet = xorr&(xorr-1);
        rightMostBitSet = rightMostBitSet^xorr;
        for(int j = 0; j <= nums.length-1; j++){
            if((nums[j]&rightMostBitSet) != 0){
                b1 = b1^nums[j];
            }else {
                b2 = b2^nums[j];
            }
        }
        ans.add(b1);
        ans.add(b2);
        return ans;
    }
}
