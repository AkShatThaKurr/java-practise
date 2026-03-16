// Second smallest element
package array.level4;

public class Q3 {
    public static void main(String[] args) {
        int[] arr = {10, 20, 15, 14, 30, 40, 200, 12, 5};
        int small = Integer.MAX_VALUE;
        int ssmall = Integer.MAX_VALUE;
        for (int num : arr) {
            if (num < small) {
                ssmall = small;
                small = num;
            } else if (num > small && num < ssmall) {
                ssmall = num;
            }
        }
        if (ssmall != Integer.MAX_VALUE) {
            System.out.println("Second smallest element is: " + ssmall);
        } else {
            System.out.println("Second smallest element is not found.");
        }
    }
}
