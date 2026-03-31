package OOPs_Concepts;

public class interface_practise {

    interface Printable {
        void print();
    }

    interface Show {
        void show();
    }

    static class Document implements Printable, Show {      // multiple inheritance
        public void print() {
            System.out.println("Printing document");
        }

        public void show() {
            System.out.println("Showing document");
        }
    }

    public static void main(String[] args) {
        Document doc = new Document();
        doc.print();
        doc.show();

    }
}

/*
Printing document
Showing document

 */
