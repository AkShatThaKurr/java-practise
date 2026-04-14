// Sort elements using TreeSet.

package PractiseQuestions._03_Collections.Set;

import java.util.TreeSet;
import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements you want to store in array: ");
        int num = sc.nextInt();
        int[] arr = new int[num];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        TreeSet<Integer> tset = new TreeSet<>();
        for (int n : arr) {
            tset.add(n);
        }
        System.out.print(tset);
    }
}
