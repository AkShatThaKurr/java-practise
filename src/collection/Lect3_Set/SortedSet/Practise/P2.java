/*
Q2. Check Element Exists
 */

package collection.Lect3_Set.SortedSet.Practise;

import java.util.Scanner;
import java.util.TreeSet;


public class P2 {

    public static String check(int val){
        TreeSet<Integer> set = new TreeSet<>();
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(40);
        set.add(50);
        for(int num: set){
            if(num==val){
                return "Value is Present.";
            }
        }
        return "Value not Found";

    }

    public static void main(String[] args) {
        System.out.print("Enter a number to check its existence: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(check(num));
    }
}
