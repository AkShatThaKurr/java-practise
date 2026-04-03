// Write a program to arrange Cricketer on the basis of Highest runs made by them.

package collection.Lect3_Set.SortedSet;
import java.util.Comparator;
import java.util.TreeSet;

public class P4 {
    public static class Player implements Comparator<Player>{
        private String name;
        private int run;

        public Player(String name, int run){
            this.name = name;
            this.run = run;
        }
        public Player(){};

        public int compare(Player p1, Player p2 ){
            if(p1.run<p2.run){
                return 1;
            }
            else if(p1.run>p2.run){
                return -1;
            }
            else{
                return 0;
            }

        }

        public String toString(){
            return "{Name: " + name + ", runs: " + run +"}";
        }
    }

    public static void main(String[] args) {
        Player p1 = new Player("Kohli",26000);
        Player p2 = new Player("Jayawardena",25000);
        Player p3 = new Player("Tendulkar",34000);
        Player p4 = new Player("Pointing",27000);
        Player p5 = new Player("Sangakkara",28000);

        TreeSet<Player> set = new TreeSet<>(new Player());
        set.add(p1);
        set.add(p2);
        set.add(p3);
        set.add(p4);
        set.add(p5);
        System.out.println(set);
    }
}
