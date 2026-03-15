// Count frequency of an element.
package array.level2;

public class Q2 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,3,2,1,12,5,3,3};
        int num=3, count=0;
        for(int n: arr){
            if(num==n){
                count++;
            }
        }
        System.out.println("Frequency of " + num + " is: " + count);
    }
}
