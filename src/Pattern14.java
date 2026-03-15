// Write a program to print diamond star pattern.
/*
    *
   * *
  * * *
   * *
    *
 */

public class Pattern14 {
    public static void main(String[] args) {
        int n=3;
        int upper=n, lower=n-1;
        //Upper
        for(int i=1; i<=upper; i++){
            for(int space=1; space<=upper-i; space++){
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        //Lower
        for(int i=1; i<=lower; i++){
            for(int space=1; space<=i; space++){
                System.out.print(" ");
            }
            for(int j=1; j<=lower-i+1; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
