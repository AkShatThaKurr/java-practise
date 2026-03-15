// Count even and odd numbers.
package array.level1;

public class Q5 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int ce=0, co=0;
        for(int num: arr){
            if(num%2==0){
                ce++;
            }
            else{
                co++;
            }
        }
        System.out.println("Count of even: " + ce);
        System.out.println("Count of odd: " + co);
    }

}
