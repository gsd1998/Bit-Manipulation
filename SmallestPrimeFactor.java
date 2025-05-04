package interviewQA.BitManipulation;

import java.util.ArrayList;

public class SmallestPrimeFactor {
    public static void main(String[] args) {
        ArrayList<Integer> result = findSmallestPrimeFactor(30);//[2,2,3]
        System.out.println(result);
    }

    private static ArrayList<Integer> findSmallestPrimeFactor(int n) {
        ArrayList<Integer> list = new ArrayList<>();
        int[] spf = getSmallestPrimeFactorList(n);
        while(n != 1){
            list.add(spf[n]);
            n = n/spf[n];
        }
        return list;
    }

    /*private static ArrayList<Integer> findSmallestPrimeFactor(int n) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=2; i*i <= n; i++){
            if(n % i == 0){
                while(n % i == 0){
                    list.add(i);
                    n = n/i;
                }
            }
        }
        if(n != 1){
            list.add(n);
        }
        return list;
    }*/

    private static int[] getSmallestPrimeFactorList(int n){
        ArrayList<Integer> list = new ArrayList<>();
        int[] spf = new int[n+1];
        for(int i = 2; i <= n; i++){
            spf[i] = i;
        }
        for(int i = 2; i <= n; i++){
            if(spf[i] == i){
                for(int j = i*i; j <= n; j+=i){
                    if(spf[j] == j){
                        spf[j] = i;
                    }
                }
            }
        }
        return spf;
    }

}
