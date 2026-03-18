package ifelse;// find greatest of two numbers

public class IfElse05 {
    public static void main(String[] args) {
        int num1=100, num2=500;
        if(num1>num2){
            System.out.println(num1);
        }
        else if(num1==num2){
            System.out.println("Both are equal.");
        }
        else{
            System.out.println(num2);
        }
    }
}
