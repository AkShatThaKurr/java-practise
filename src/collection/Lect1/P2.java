// Some methods for Integer(wrapper) class
// Integer.parseInt() to convert string into integer, but ye string should be number.
// Integer.toString() to convert integer into string.
// Integer.compare()

package collection.Lect1;

public class P2 {
    public static void main(String[] args) {
        // Integer.parseInt()
        String s1 = "12345";     // this string should always be numeric.
        int num1 = Integer.parseInt(s1);      // string -> integer
        System.out.println(num1);

        int num2 = Integer.parseInt("2026");       // string -> integer
        System.out.println(num2);

        //Integer.toString()
        int num3 = 10;
        String s2 = Integer.toString(num3);   // integer -> string
        System.out.println(s2);

        //Integer.compare()
        System.out.println("Integer.compare(3,5) = " + Integer.compare(3, 5));   // when a<b, -1
        System.out.println("Integer.compare(3,3) = " + Integer.compare(3, 3));   // when a==b, 0
        System.out.println("Integer.compare(5,3) = " + Integer.compare(5, 3));   // when a>b, 1

        // boolean -> Boolean    (from bolean to Boolean(wrapper) class
        boolean a = false;
        Boolean b = a;
        System.out.println("Boolean b = " + b);
    }

}

/* Output:
12345
2026
10
Integer.compare(3,5) = -1
Integer.compare(3,3) = 0
Integer.compare(5,3) = 1
false
 */
