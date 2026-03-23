// Program to print all characters of a string using loop and charAt()
// charAt() is used with loop to access each character of the string.

package strings.methodsinstring;

public class method3_2charAt {
    public static void main(String[] args) {
        String name = "akshat";
        for (int i = 0; i < name.length(); i++) {
            System.out.println("char at index " + i + " is: " + name.charAt(i));
        }
    }
}
