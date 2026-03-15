package array.level1;
import java.util.Scanner;

class Array{
    int[] arr;

    void arrayInput(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements in array: ");
        int size = sc.nextInt();
        arr = new int[size];
        System.out.println("Enter array elements:");
        for(int i=0; i<size; i++){
            arr[i] = sc.nextInt();
        }
        sc.close();
    }

    void arrayPrint(){
        for(int num: arr){
            System.out.print(num + " ");
        }
    }
}

public class Q2 {

    public static void main(String[] args) {
        Array ar = new Array();
        ar.arrayInput();
        ar.arrayPrint();
    }
}
