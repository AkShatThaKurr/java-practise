// Count duplicate elements
package array.level2;

public class Q6 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 1, 2, 3, 4, 5};
        int count = 0, size = arr.length;
        for (int i = 0; i < size; i++) {
            boolean flag = false;
            for (int check = 0; check < i; check++) {
                if (arr[i] == arr[check]) {
                    flag = true;
                    break;
                }
            }
            if (flag) {
                continue;
            }
            for (int j = i + 1; j < size; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                    break;
                }
            }
        }
        System.out.println("Number of duplicate elements: " + count);
    }
}
