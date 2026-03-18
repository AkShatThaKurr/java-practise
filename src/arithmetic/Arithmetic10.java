package arithmetic;// (Program to calculate percentage of 5 subjects. )

public class Arithmetic10 {
    public static void main(String[] args) {
        double s1=40, s2=50, s3=60, s4=70, s5=80;
        double sTotal = s1 + s2 + s3 + s4 + s5;
        double percentage = (sTotal * 100) / 500;
        System.out.println("Percentage of 5 subjects is: " + percentage);
    }
}
