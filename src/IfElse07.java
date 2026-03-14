// Check eligible for voting (age>=18)

public class IfElse07 {
    public static void main(String[] args) {
        int age = 23;
        if(age>= 18){
            System.out.println("You are allowed to vote.");
        }
        else if(age>0){
            System.out.println("You are not allowed to vote.");
        }
        else{
            System.out.println("Invalid input.");
        }
    }
}
