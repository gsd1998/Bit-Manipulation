package interviewQA.BitManipulation;

import java.util.ArrayList;

public class CountPrimes {
    public static void main(String[] args) {
        int result = countPrimesPrefixSum(10);//4
        System.out.println(result);
    }

    /*public static int countPrimes(int n) {
        int prime[] = getSieve(n);
        int count = 0;
        for(int i = 2; i < n; i++){
            count = count + prime[i];
            prime[i] = count;
        }
        return prime[n];
    }*/

    //Using prefixSum
    public static int countPrimesPrefixSum(int n) {
        int prime[] = getSieve(n);
        int count = 0;
        if(n == 2){
            return 0;
        }
        for(int i = 2; i <= n; i++){
            count = count + prime[i];
            prime[i] = count;
        }
        return prime[n];

    }

    private static int[] getSieve(int n) {
        int[] prime = new int[n+1];
        for(int i = 2; i < n; i++){
            prime[i] = 1;
        }
        for(int i = 2; i*i <= n; i++){
            if(prime[i] == 1){
                for(int j = i*i; j <= n; j+=i){
                    prime[j] = 0;
                }
            }
        }
        return prime;
    }
}
