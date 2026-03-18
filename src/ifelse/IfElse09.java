package ifelse;// Check leap your

public class IfElse09 {
    public static void main(String[] args) {
        int year = 2024;
        if(year%400==0){
            System.out.println(year + " is a leap year.");
        }
        else if(year%100==0){
            System.out.println(year + " is not a leap year.");
        }
        else if(year%4==0){
            System.out.println(year + " is a leap your.");
        }
        else{
            System.out.println(year + " is not a leap year");
        }
    }
}
