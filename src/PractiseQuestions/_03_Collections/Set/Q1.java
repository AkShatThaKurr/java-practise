// Remove duplicates using HashSet.

package PractiseQuestions._03_Collections.Set;

import java.util.HashSet;
import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements you want to store: ");
        int num = sc.nextInt();
        System.out.println("Enter " + num + " elements: ");
        int[] arr = new int[num];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        HashSet<Integer> hset = new HashSet<>();
        for (int n : arr) {
            hset.add(n);
        }
        System.out.println(hset);

    }
}
