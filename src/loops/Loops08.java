package loops;// Write a program to count numbers divisible by 3 from 1 to 100.

public class Loops08 {
    public static void main(String[] args) {
        int count=0;
        for(int i=1; i<=100; i++){
            if(i%3==0){
                count++;
            }
        }
        System.out.println(count);
    }
}
