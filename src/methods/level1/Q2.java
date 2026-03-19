// greet() method banao jo "Hello" print kare, aur usse main() me 3 baar call karo.
package methods.level1;

public class Q2 {
    void greet(){
        System.out.println("Hello");
    }

    public static void main(String[] args) {
        Q2 obj = new Q2();
        obj.greet();
        obj.greet();
        obj.greet();
    }
}
