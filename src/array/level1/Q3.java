// Sum of elements.

package array.level1;

public class Q3 {
    public static void main(String[] args) {
        int[] arr = new int[]{10, 20, 30, 40, 50};
        int sum = 0;
        for(int num: arr){
            sum = sum + num;
        }
        System.out.println(sum);
    }
}
