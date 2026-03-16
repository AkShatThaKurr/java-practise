// Rotate array left by 1.

package array.level3;

public class Q3 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int temp = arr[0], size=arr.length;
        for(int i=0; i<size-1; i++){
            arr[i]=arr[i+1];
        }
        arr[size-1] = temp;
        for(int num: arr){
            System.out.print(num + " ");
        }
    }
}
