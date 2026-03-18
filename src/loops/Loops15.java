package loops;// Write a program to check palindronme number

public class Loops15 {
    public static void main(String[] args) {
        int num = 2002;
        int temp = num, rev = 0;
        if(num<0){
            System.out.println("No," + num + " is not Palindrome.");
        }
        else{
            while(temp!=0){
                rev = (rev*10) + (temp%10);
                temp = temp/10;
            }
            if(num==rev){
                System.out.println("Yes, " + num + " is Palindrome.");
            }
            else{
                System.out.println("No, " + num + " is not Palindrome.");
            }
        }
    }
}
