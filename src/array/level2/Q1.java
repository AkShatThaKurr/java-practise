// Linear Search

package array.level2;

public class Q1 {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50};
        int num=30;
        boolean flag = false;
        for(int n: arr){
            if(num==n){
                flag=true;
                break;
            }
        }
        if(flag){
            System.out.println(num + " is present.");
        }
        else{
            System.out.println(num + " is not present.");
        }
    }
}
