// Average of array elements.

package array.level1;

public class Q4 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        double sum = 0;
        for(int num: arr){
            sum = sum + num;
        }
        System.out.println(sum/arr.length);
    }
}
