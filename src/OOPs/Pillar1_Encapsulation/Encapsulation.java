package OOPs.Pillar1_Encapsulation;

public class Encapsulation {
    public static void main(String[] args) {
        bankAccount acc = new bankAccount();
        acc.setBalance(50000);
        double result = acc.getBalance();
        System.out.println("Balance: " + result);
    }
}
