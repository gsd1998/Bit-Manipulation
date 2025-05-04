package interviewQA.BitManipulation;

import java.util.ArrayList;

public class PrintPrimeFactorsOfANumber {
    public static void main(String[] args) {
        ArrayList<Integer> result = findPrimeFactors(10);//[2, 5]
        System.out.println(result);
    }

    /*private static ArrayList<Integer> checkPrimeFactors(int n) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 2; i <= n; i++){
            if(n % i == 0) {
                if (checkPrime(i)) {
                    list.add(i);
                }
            }
        }
        return list;
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
    }*/

    /*private static ArrayList<Integer> checkPrimeFactors(int n) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=2; i <= n; i++){
            if(n % i == 0){
                list.add(i);
                while(n % i == 0){
                    n = n/i;
                }
            }
        }
        return list;
    }*/

    private static ArrayList<Integer> findPrimeFactors(int n) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=2; i*i <= n; i++){
            if(n % i == 0){
                list.add(i);
                while(n % i == 0){
                    n = n/i;
                }
            }
        }
        if(n != 1){
            list.add(n);
        }
        return list;
    }

}
