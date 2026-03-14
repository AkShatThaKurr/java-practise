// Check triangle type

public class IfElse14 {
    public static void main(String[] args) {
        double s1=3, s2=3, s3=3;
        if( (s1+s2>s3) && (s1+s3>s2) && (s2+s3>s1)){
            if((s1==s2) && (s1==s3)){
                System.out.println("Equilateral Triangle");
            }
            else if( (s1==s2) || (s1==s3) || (s2==s3) ){
                System.out.println("Isosceles Triangle");
            }
            else{
                System.out.println("Scalene Triangle");
            }
        }
        else{
            System.out.println("Not a Triangle");
        }
    }
}
