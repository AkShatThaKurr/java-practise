// Check whether number is divisible by 5 and 11.

public class IfElse06 {
    public static void main(String[] args) {
        int num=55;
        if( (num%5==0) && (num%11==0)){
            System.out.println("Divisible");
        }
        else{
            System.out.println("Not Divisible");
        }
    }
}
