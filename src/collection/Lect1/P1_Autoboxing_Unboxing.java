// Auto-boxing and Un-boxing!
package collection.Lect1;

public class P1_Autoboxing_Unboxing {
    public static void main(String[] args) {
        // auto-boxing: Conversion of primitive data type into object.
        int a = 10;
        Integer val = a;    // auto-boxing is done.
        System.out.println(val);


        // un-boxing: Conversion of object into primitive data type.
        Integer b = 200;
        int value = b;      // un-boxing is done.
        System.out.println(value);
    }
}

/* Output:
10
200
 */
