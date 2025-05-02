package interviewQA.BitManipulation;

import java.util.ArrayList;
import java.util.List;

public class Subsets_PowerSet {
    public List<List<Integer>> subsets(int[] nums) {
        //nums : [1,2,3]
        int n = nums.length;
        int noOfSubsets = 1<<n;
        List<List<Integer>> ans = new ArrayList<>();

        for(int i = 0; i <= noOfSubsets-1; i++){
            List<Integer> list = new ArrayList<>();
            for(int j = 0; j <= n-1; j++){
                if((i &(1<<j)) != 0){
                    list.add(nums[j]);
                }
            }
            ans.add(list);
        }
        return ans; //[[],[1],[2],[1,2],[3],[1,3],[2,3],[1,2,3]]
    }
}
