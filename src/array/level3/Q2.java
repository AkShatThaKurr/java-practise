// copy array elements
package array.level3;

public class Q2 {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50};
        int size = arr.length;
        int[] newArr = new int[size];
        for(int i=0; i<size; i++){
            newArr[i] = arr[i];
        }
        System.out.print("Previous array: ");
        for(int num: arr){
            System.out.print(num + " ");
        }
        System.out.println();
        System.out.print("New array: ");
        for(int num: newArr){
            System.out.print(num + " ");
        }
    }
}
