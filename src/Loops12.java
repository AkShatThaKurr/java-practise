// Write a program to reverse a number.

public class Loops12 {
    public static void main(String[] args) {
        int num = 102030;
        int rev = 0, temp=num;
        while(temp!=0){
            rev = rev*10 + (temp%10);
            temp = temp/10;
        }
        System.out.println(rev);
    }
}
