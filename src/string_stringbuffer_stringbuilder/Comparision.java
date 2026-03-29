// Comparision between: String Vs StringBuffer Vs StringBuilder

package string_stringbuffer_stringbuilder;

public class Comparision {
    public static void main(String[] args) {
        // 🔹 String (Immutable)
        System.out.println("----- String -----");
        String s = "Hello";
        s.concat(" World");
        System.out.println(s); // Hello (no change)

        s = s.concat(" World");
        System.out.println(s); // Hello World

        System.out.println();

        // 🔹 StringBuffer (Mutable + Thread-safe)
        System.out.println("----- StringBuffer -----");
        StringBuffer sbuf = new StringBuffer("Hello");
        sbuf.append(" World");
        System.out.println(sbuf); // Hello World

        System.out.println();

        // 🔹 StringBuilder (Mutable + Fast)
        System.out.println("----- StringBuilder -----");
        StringBuilder sbui = new StringBuilder("Hello");
        sbui.append(" World");
        System.out.println(sbui); // Hello World
    }
}
