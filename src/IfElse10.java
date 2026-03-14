// Find the greatest of three numbers

public class IfElse10 {
    public static void main(String[] args) {
        int num1=100, num2=30, num3=44;
        if( (num1>=num2) && (num1>=num3)){
            System.out.println(num1 + " is greatest.");
        }
        else if(num2>=num3){
            System.out.println(num2 + " is greatest.");
        }
        else{
            System.out.println(num3 + " is greatest.");
        }
    }
}
