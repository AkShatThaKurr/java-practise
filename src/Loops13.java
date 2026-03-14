// Write a program to count digits in a number.

public class Loops13 {
    public static void main(String[] args) {
        int num=12345;
        int count=0, temp=num;
        if(temp==0){
            System.out.println("Number of digits: 1");
            return;
        }
        while(temp!=0){
            temp=temp/10;
            count++;
        }
        System.out.println("Number of digits: " + count);
    }
}
