package interviewQA.BitManipulation;

public class SingleNumber {
    public int singleNumber(int[] nums) {
        int xor = 0;
        for(int i=0; i <= nums.length-1; i++){
            xor = xor^nums[i];
        }
        return xor;
    }
}
