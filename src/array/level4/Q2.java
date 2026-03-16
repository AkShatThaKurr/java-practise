// Second largest element
package array.level4;

public class Q2 {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 0, 10, 20, 0, 10, 50};
        int lar = Integer.MIN_VALUE, slar = Integer.MIN_VALUE;
        for (int num: arr) {
            if (num > lar) {
                slar = lar;
                lar = num;
            } else if (num < lar && num > slar) {
                slar = num;
            }
        }
        if (slar != Integer.MIN_VALUE) {
            System.out.println("Second largest element is: " + slar);
        } else {
            System.out.println("Second largest element is not found.");
        }
    }
}


