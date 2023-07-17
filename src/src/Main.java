import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

//        LL ll = new LL();
//        ll.insertFirst(10);
//        ll.insertFirst(8);
//        ll.insertFirst(14);
//        ll.display();
//        ll.insertLast(99);
//        System.out.println();
//        ll.display();
//        ll.insert(15,3);
//        System.out.println();
//        ll.display();
//        ll.deleteFirst();
//        System.out.println();
//        ll.display();
//        ll.deleteLast();
//        System.out.println();
//        ll.display();
//        ll.delete(1);
//        System.out.println();
//        ll.display();


//        DLL dl = new DLL();
//        dl.insertFirst(10);
//        dl.insertFirst(20);
//        dl.insertFirst(30);
//        dl.insertFirst(40);
//        dl.display();
//        dl.insert(20,70);
//        dl.display();

        CLL cl = new CLL();
        cl.insertVal(10);
        cl.insertVal(20);
        cl.insertVal(30);
        cl.insertVal(40);
        cl.display();
        cl.delete(40);
        System.out.println();
        cl.display();
    }
}