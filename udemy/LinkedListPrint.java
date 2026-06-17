public class LinkedListPrint {

    private Node Head;
    private Node Tail;
    private int length;

    public class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
        }
    }

    public LinkedList(int value) {
        Node newNode = new Node(value);
        Head = newNode;
        Tail = newNode;
        length = 1;
    }

  public void printList() {
        Node temp = Head;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public void getHead() {
        System.out.println("Head: " + Head.value);
    }

    public void getTail() {
        System.out.println("Tail: " + Tail.value);
    }

    public void getLength() {
        System.out.println("Length: " + length);
    }


}
