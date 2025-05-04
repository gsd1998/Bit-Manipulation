package interviewQA.BitManipulation;

public class CheckIfPrimeOrNot {
    public static void main(String[] args) {
       boolean result = checkPrime(18);
        System.out.println(result);
    }
    private static boolean checkPrime(int n) {
        int cnt = 0;
        for(int i = 1; i*i <= n; i++){
            if(n%i==0){
                cnt++;
                if((n/i) != i){
                    cnt++;
                }
            }
        }
        if(cnt == 2)
            return true;
        return false;
    }
}
