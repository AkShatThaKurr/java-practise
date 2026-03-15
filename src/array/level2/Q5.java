// Last occurrence of element
package array.level2;

public class Q5 {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50,40,50,20,40,50,80,90};
        int num=40,index=-1;
        int size = arr.length;
        for(int i=size-1; i>=0; i--){
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
