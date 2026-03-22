// using Setter-Getter method to access private members.
package accessmodifiers.b_private;

class Student {
    private int age;

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return this.age;
    }


}

public class Q1 {
    public static void main(String[] args) {
        Student s = new Student();
        s.setAge(23);
        int result = s.getAge();
        System.out.println("Age: " + result);
    }
}
