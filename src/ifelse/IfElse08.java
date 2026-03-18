package ifelse;// Check Pass or Fail

public class IfElse08 {
    public static void main(String[] args) {
        int marks = 79;
        if(marks<0 || marks>100){
            System.out.println("Invalid input");
        }
        else if(marks>=30){
            System.out.println("Pass");
        }
        else{
            System.out.println("Fail");
        }
    }
}
