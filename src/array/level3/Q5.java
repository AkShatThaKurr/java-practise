// Shift all zeros to end
package array.level3;

public class Q5 {
    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 0, 3, 0, 0, 0, 7, 9};
        int index = 0;
        int size = arr.length;
        for (int i = 0; i < size; i++) {
            if (arr[i] != 0) {
                arr[index] = arr[i];
                index++;
            }
        }
        while (index < size) {
            arr[index] = 0;
            index++;
        }
        for (int num : arr) {
            System.out.print(num + " ");
        }


    }
}
