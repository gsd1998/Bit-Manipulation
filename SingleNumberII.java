package interviewQA.BitManipulation;

public class SingleNumberII {
    public static void main(String[] args) {
        int[] nums = {5,5,5,6,4,4,4};
        int result = singleNumberUsingBitManipulation(nums);
        System.out.println(result);
    }
    public static int singleNumber(int[] nums) {
        int xor = 0;
        for(int i = 1; i <= nums.length-1; i+=3){
            if(nums[i] != nums[i-1]){
                return nums[i-1];
            }
        }
        return nums[nums.length-1];
    }

    public static int singleNumberUsingBitManipulation(int[] nums) {
       int ans = 0;
       for(int i = 0; i < 32; i++){
           int cnt = 0;
           for(int j = 0; j <= nums.length-1; j++){
               if((nums[j]&(1<<i)) != 0){
                   cnt++;
               }
           }
           if(cnt % 3 != 0){
               ans = ans|(1<<i);
           }
       }
       return ans;
    }
}
