package ifelse;// Grade calculate (90+ -> A, 80+ -> B, etc)


public class IfElse11 {
    public static void main(String[] args) {
        int marks=93;
        if(marks>100 || marks<0){
            System.out.println("Invalid input");
        }
        else if(marks>=90){
            System.out.println("Grade = A");
        }
        else if(marks>=80){
            System.out.println("Grade = B");
        }
        else if(marks>=65){
            System.out.println("Grade = C");
        }
        else if(marks>=50){
            System.out.println("Grade = D");
        }
        else if(marks>=33){
            System.out.println("Grade = E");
        }
        else{
            System.out.println("Grade = Fail");
        }

    }
}
