/* Hashset:
Duplicate values store nhi krta.
Insertino order maintain nhi krta.
Output random hota h( jis order m input kiya vo nhi hota.)
 */

package collection.Lect3_Set.Hashset;

import java.util.Set;
import java.util.HashSet;

public class P1 {
    public static void main(String[] args) {
        Set<Integer> hSet = new HashSet<>();
        hSet.add(10);
        hSet.add(20);
        hSet.add(10);   // ignored
        hSet.add(20);   // ignored
        hSet.add(10);   // ignored
        hSet.add(30);
        hSet.add(500);
        hSet.add(250);
        hSet.add(900);
        hSet.add(50);
        System.out.println(hSet);
    }
}

/* Output:
[50, 20, 500, 900, 10, 250, 30]
 */
