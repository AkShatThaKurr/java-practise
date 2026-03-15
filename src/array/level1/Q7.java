// find max element

package array.level1;

public class Q7 {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,25,35};
        int max = Integer.MIN_VALUE;
        for(int num: arr){
            if(max<num){
                max=num;
            }
        }
        System.out.println("Max element is: " + max);
    }

}
