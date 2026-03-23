package accessmodifiers.d_2_protected;

import accessmodifiers.d_1_protected.c1;

public class c2 extends c1{
    void display(){
        System.out.println(s);
    }

    public static void main(String[] args) {
        c2 obj = new c2();
        obj.display();
    }
}
