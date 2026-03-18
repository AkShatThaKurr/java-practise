package ifelse;// check character is vowel or consonant

public class IfElse12 {
    public static void main(String[] args) {
        char c = 'I';
        if( (c>='a' && c<='z') || (c>='A' && c<='Z')){
            if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u' || c=='A' || c=='E' || c=='I' || c=='O' || c=='U'){
                System.out.println("Vowel");
            }
            else{
                System.out.println("Consonant");
            }
        }
        else{
            System.out.println("Invalid input");
        }
    }
}
