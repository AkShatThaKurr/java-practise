// (Program to calculate Profit or loss)

public class IfElse02 {
    public static void main(String[] args) {
        double cP=500, sP=700;
        if(sP>cP){
            System.out.println("Profit of " + (sP-cP) + " is made.");
        } else if ((sP == cP)) {
            System.out.println("No Profit, No Loss.");
        }
        else{
            System.out.println("Loss of " + (cP-sP) + " is made.");
        }
    }
}
