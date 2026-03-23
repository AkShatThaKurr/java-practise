// Program to convert a string into a character array using toCharArray()

package strings.methodsinstring;

public class method4toCharArray {
    public static void main(String[] args) {
        String name = "akshat";
        char[] arr = name.toCharArray();
        for (char num : arr) {
            System.out.print(num);
        }
    }
}
