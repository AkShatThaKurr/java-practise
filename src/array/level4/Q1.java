// Check if array is sorted.

package array.level4;

public class Q1 {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50, 100, 95};
        int size = arr.length;
        boolean flag = true;
        for (int i = 0; i < size - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                flag = false;
                break;
            }
        }
        if (flag) {
            System.out.println("Array is sorted.");
        } else {
            System.out.println("Array is unsorted.");
        }

    }
}
