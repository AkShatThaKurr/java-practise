/*
Q3. Reverse Order */

package collection.Lect3_Set.SortedSet.Practise;

import java.util.Comparator;
import java.util.TreeSet;

public class P3 {
    public static class descOrder implements Comparator<descOrder>{
        private int Marks;

        public descOrder(){};
        public descOrder(int num){
            this.Marks = num;
        }
        public int compare(descOrder m1, descOrder m2){
            if(m1.Marks < m2.Marks){
                return 1;
            }
            else if(m1.Marks > m2.Marks){
                return -1;
            }
            else{
                return 0;
            }
        }

        public String toString(){
            return "Marks:" + Marks;
        }
    }
    public static void main(String[] args) {
        descOrder m1 = new descOrder(50);
        descOrder m2 = new descOrder(500);
        descOrder m3 = new descOrder(5000);
        descOrder m4 = new descOrder(50000);
        TreeSet<descOrder> marks = new TreeSet<>(new descOrder());
        marks.add(m1);
        marks.add(m2);
        marks.add(m3);
        marks.add(m4);
        System.out.println(marks);
    }
}
