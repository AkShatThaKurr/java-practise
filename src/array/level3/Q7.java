// Replace element by sum of previous and next.
package array.level3;

public class Q7 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int size = arr.length;
        int prev = 0, next, temp;
        for (int i = 0; i < size; i++) {
            temp = arr[i];
            if (i == size - 1) {
                next = 0;
            } else {
                next = arr[i + 1];
            }
            arr[i] = prev + next;
            prev = temp;

        }
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}