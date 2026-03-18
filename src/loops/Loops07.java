package loops;// Write a program to find sum of even numbers from 1 to 50.

public class Loops07 {
    public static void main(String[] args) {
        int SumEven = 0;
        for(int i=1; i<=50; i++){
            if(i%2==0){
                SumEven = SumEven + i;
            }
        }
        System.out.println(SumEven);
    }

}
