package interviewQA.BitManipulation;

public class MinimumBitFlipsToConvertNumber {
    public int minBitFlipsApproach1(int start, int goal) {
        int diff = start^goal;
        int count = 0;
        while(diff != 0){
            diff = diff&(diff-1);
            count++;
        }
        return count;
    }

    public int minBitFlipsApproach2(int start, int goal) {
        int diff = start^goal;
        int rem = 0;
        while(diff > 0){
            if((diff&1) == 1){
                rem = rem + 1;
            }
            diff = diff>>1;
        }
        return rem;
    }
}
