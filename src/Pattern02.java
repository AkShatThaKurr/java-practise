// Write a program to print a square made of stars.

public class Pattern02 {
    public static void main(String[] args) {
        int n=4;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
