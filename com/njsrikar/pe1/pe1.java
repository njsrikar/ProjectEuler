/*
If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.

Find the sum of all the multiples of 3 or 5 below 1000.
*/
public class pe1{
    public static void main(String[] args){
        System.out.println("test");
        
        long x = findSumAllMultiplesBelow(5, 3, 999);
        System.out.println(x);
    }
    
    private static long findSumAllMultiplesBelow(int num1, int num2, int max){
        int x = max;
        long totalSum = 0;
        while(x > 0){
            
            //is multiple of 5
            if(x%num1 == 0 || x%num2 == 0){
                totalSum += x;
            }
            x--;
        }
        return totalSum;
    }
}