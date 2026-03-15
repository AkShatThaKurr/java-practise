// First occurrence of element
package array.level2;

public class Q4 {
    public static void main(String[] args) {
        int[] arr = {10,20,30,20,50,30,40};
        int num = 30, index=-1;
        for(int i=0; i<arr.length; i++){
            if(num==arr[i]){
                index=i;
                break;
            }
        }
        if(index==-1){
            System.out.println("Element not found.");
        }
        else{
            System.out.println("Element is found at index: " + index);
        }
    }
}
