// Write a program to print decreasing number triangle.
/*
1 2 3 4
1 2 3
1 2
1
 */

public class Pattern08 {
    public static void main(String[] args) {
        int n=4;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n-i+1; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
