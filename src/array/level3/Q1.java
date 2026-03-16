// Reverse an array

package array.level3;

public class Q1 {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        int size = arr.length;
        System.out.println("Before reversing:");
        for(int num: arr){
            System.out.print(num + " ");
        }
        for(int i=0; i<size/2; i++){
            int temp=arr[i];
            arr[i] = arr[size-1-i];
            arr[size-1-i]=temp;
        }
        System.out.println();
        System.out.println("After reversing:");
        for(int num: arr){
            System.out.print(num + " ");
        }
    }
}
