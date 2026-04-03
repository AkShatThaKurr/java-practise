// Comparator is Interface, compare is the method.
package collection.Lect3_Set.SortedSet;

import java.util.Comparator;
import java.util.TreeSet;

public class P3 {

    public static class Book implements Comparator<Book>{

        private int Sno;
        private String Code;
        private String Name;

        public Book(int Sno, String Code, String Name){
            this.Sno = Sno;
            this.Code = Code;
            this.Name = Name;
        }

        public String toString(){
            return "{Sno:" + Sno + ", Code:" + Code + ", Name:" + Name + "}";
        }

        public int compare(Book B1,Book B2){
            if(B1.Sno<B2.Sno){
                return 1;
            }
            else if(B1.Sno>B2.Sno){
                return -1;
            }
            else{
                return 0;
            }
        }
        public Book(){};
    }

    public static void main(String[] args) {
        Book B1 = new Book(1, "B101", "A");
        Book B2 = new Book(2, "B102", "B");
        Book B3 = new Book(3, "B103", "C");
        Book B4 = new Book(4, "B104", "D");

        TreeSet<Book> set = new TreeSet<>(new Book());
        set.add(B1);
        set.add(B2);
        set.add(B3);
        set.add(B4);
        System.out.println(set);
    }

}
