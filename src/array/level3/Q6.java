// Seperate even and odd numbers.
package array.level3;

public class Q6 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int size = arr.length;
        int[] newArray = new int[size];
        int index = 0;
        for (int num : arr) {
            if (num % 2 == 0) {
                newArray[index] = num;
                index++;
            }
        }
        for (int num : arr) {
            if (num % 2 != 0) {
                newArray[index] = num;
                index++;
            }
        }
        for (int num : newArray) {
            System.out.print(num + " ");
        }

    }
}
