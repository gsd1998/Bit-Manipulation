package interviewQA.BitManipulation;

import java.util.ArrayList;

public class AllDivisorsOfANumber {

    public static void main(String[] args) {
        ArrayList<Integer> result = calculateDivisors(36);
        System.out.println(result);
    }

    private static ArrayList<Integer> calculateDivisors(int n) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 1; i*i <= n; i++){
            if(n%i==0){
                list.add(i);
                if((n/i) != i){
                    list.add(n/i);
                }
            }
        }
        return list;
    }

}
