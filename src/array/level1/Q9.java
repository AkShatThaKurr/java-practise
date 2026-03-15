// Find index of element.
package array.level1;

public class Q9 {
    public static void main(String[] args) {
        int num=50,index=-1;
        boolean flag = false;
        int[] arr = {10,20,30,40,50,60,70,80,90,100};
        for(int i=0; i<arr.length; i++){
            if(arr[i]==num){
                index=i;
                flag = true;
                break;
            }
            }
        if(flag){
            System.out.println("Index is: " + index);
        }
        else{
            System.out.println("Element not found.");
        }
    }
}
