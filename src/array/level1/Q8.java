// Find minimum element
package array.level1;

public class Q8 {
    public static void main(String[] args) {
        int[] arr = {10,20,30,4,5,20,15};
        int min = Integer.MAX_VALUE;
        for(int num: arr){
            if(min>num){
                min = num;
            }
        }
        System.out.println("Minimum element is: " + min);
    }
}
