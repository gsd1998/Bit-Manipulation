package interviewQA.BitManipulation;

import java.util.ArrayList;

public class SieveOfEratosthenes {

    public static void main(String[] args) {
        ArrayList<Integer> result = findPrimeFactorisation(10);//[2, 3, 5, 7]
        System.out.println(result);
    }

    private static ArrayList<Integer> findPrimeFactorisation(int n) {
        ArrayList<Integer> list = new ArrayList<>();
        int[] prime = getSieve(n);
        for(int i = 2; i <= n; i++){
            if(prime[i] == 1){
                list.add(i);
            }
        }
        return list;
    }

    private static int[] getSieve(int n) {
        int[] prime = new int[n+1];
        for(int i = 2; i<= n; i++){
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
