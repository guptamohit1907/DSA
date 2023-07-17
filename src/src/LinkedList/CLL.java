package LinkedList;

public class CLL {
    private  Node head;
    private Node tail;

    public CLL() {
        this.head = null;
        this.tail = null;
    }

    public void insertVal(int val){
        Node node = new Node(val);
        if (head == null){
            head = node;
            tail = node;
            return;
        }

        tail.next = node;
        node.next = head;
        tail = node;
    }

    public  void display(){
        Node node = head;
        if (head != null){
            do {
                System.out.print(node.val + " -> ");
                node = node.next;
            } while (node != head);
        }
        System.out.print("HEAD");
    }

    public void  delete(int val){
        Node node = head;
        if (node == null){
            return;
        }
        if (node.val == val){
            head = head.next;
            tail.next = head;
            return;
        }

        do {
            Node n = node.next;
            if (n.val == val){
                node.next = n.next;
                break;
            }
            node = node.next;
        } while (node != head);
    }

    private  class Node{
        int val;
        Node next;

        public Node(int val) {
            this.val = val;
        }
    }

    public static class Main {
        public static void main(String[] args) {
            System.out.println("Hello world!");

    //        LinkedList.LL ll = new LinkedList.LL();
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


    //        LinkedList.DLL dl = new LinkedList.DLL();
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
}
