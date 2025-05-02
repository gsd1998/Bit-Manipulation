package interviewQA.BitManipulation;

public class XorOfNumbersFromLToR {
    public static void main(String[] args) {
        int result = calculateXor(10);
        int result2 = calculateXorFromLtoR(5, 7);
        System.out.println(result2);
    }

    private static int calculateXorFromLtoR(int l, int r) {
        return calculateXor(l-1)^calculateXor(r);
    }

    private static int calculateXor(int n) {
        if(n % 4 == 1){
            return 1;
        }
        else if(n % 4 == 2){
            return n+1;
        }
        else if(n % 4 == 3){
            return 0;
        }else
            return n;
    }
}
