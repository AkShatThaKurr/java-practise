// Print array elements.
package array.level1;

class ArrayPrinter{
    int[] arr = {1,2,3,4,5};

    void printArray(){
        for(int num: arr){
            System.out.print(num + " ");
        }
    }
}

public class Q1 {
    public static void main(String[] args) {
        ArrayPrinter ar = new ArrayPrinter();
        ar.printArray();
    }
}
