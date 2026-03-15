// Count positive, negative, zero.

package array.level1;

public class Q6 {
    public static void main(String[] args) {
        int positiveCount=0, negativeCount=0, zeroCount=0;
        int[] arr = {-5,-4,-3,-2,-1,0,0,0,0,1,2,3,4,5};
        for(int num: arr){
            if(num>0){
                positiveCount++;
            }
            else if(num<0){
                negativeCount++;
            }
            else{
                zeroCount++;
            }
        }
        System.out.println("Positive numbers are: " + positiveCount);
        System.out.println("Negative numbers are: " + negativeCount);
        System.out.println("Zero numbers are: " + zeroCount);
    }
}
