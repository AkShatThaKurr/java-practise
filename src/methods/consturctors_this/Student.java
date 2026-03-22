// Understanding Constructor and this keyword

package methods.consturctors_this;

public class Student {
    String name;
    Student(String name){
        this.name = name;
    }
    void printName(){
        System.out.println(this.name);
    }

    public static void main(String[] args) {
        Student s1 = new Student("Akshat");
        Student s2 = new Student("Siddu");

        s1.printName();
        s2.printName();
    }
}
