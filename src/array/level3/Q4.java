// Rotate array right by 1.
package array.level3;

public class Q4 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5, 6, 7, 8, 9, 10};
        int size = arr.length;
        int temp = arr[size - 1];
        for (int i = size - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }
        arr[0] = temp;
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
