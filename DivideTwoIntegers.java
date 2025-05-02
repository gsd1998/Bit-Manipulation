package interviewQA.BitManipulation;

public class DivideTwoIntegers {
    public int divide(int dividend, int divisor) {
        int sum = 0;
        int count = 0;
        boolean sign = false;
        if(dividend >= 0 && divisor < 0){
            sign = true;
            divisor = divisor * -1;
        }
        if(dividend < 0 && divisor >=0){
            sign = true;
            dividend = dividend * -1;
        }
        if(dividend < 0 && divisor < 0){
            divisor = divisor * -1;
            dividend = dividend * -1;
        }

        while(sum + divisor <= dividend){
            count++;
            sum = sum + divisor;
        }
        if(sign == true){
            count = -count;
        }
        return count;
    }
}
