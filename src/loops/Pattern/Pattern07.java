package loops.Pattern;// Write a program to print repeating numbers in triangle form.

public class Pattern07 {
    public static void main(String[] args) {
        int n=4;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
