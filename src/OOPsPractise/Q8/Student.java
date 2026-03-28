package OOPsPractise.Q8;

public class Student extends Person {
    int rollNo;

    public Student(String name, int rollNo){
        super(name);
        this.rollNo = rollNo;
    }
    void display(){
        System.out.println("Name: " + name);
        System.out.println("RollNO: " + rollNo);
    }



}
