// Write a program to find sum of digits

public class Loops14 {
    public static void main(String[] args) {
        int num = 12345;
        int sum=0, temp=num;
        while(temp!=0){
            sum = sum + (temp%10);
            temp = temp/10;
        }
        System.out.println("The sum of digits of " + num + " is: " + sum);
    }
}
