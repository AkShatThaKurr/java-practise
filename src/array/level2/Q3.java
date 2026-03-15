// Check if element exists
package array.level2;

public class Q3 {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50};
        int num=50;
        boolean result = false;
        for(int n: arr){
            if(n==num){
                result=true;
                break;
            }
        }
        if(result){
            System.out.println("Yes, " + num + " exist in the array.");
        }
        else{
            System.out.println("No, " + num + " does not exist in the array.");
        }
    }
}
