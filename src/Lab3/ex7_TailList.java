package Lab3;
public class ex7_TailList {
    static class Node {
        int data;
        Node next;

        public Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }
    }
    Node head; // Голова списка
    Node tail; // Хвост списка
    // Добавление в конец (с хвоста)
    public void addLast(int data) {
        Node newNode = new Node(data, null);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }
    // Вывод списка
    public void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        ex7_TailList list = new ex7_TailList();
        // Точки для отладки:
        list.addLast(1); // Точка 1
        list.addLast(2); // Точка 2
        list.addLast(3); // Точка 3
        System.out.println("Список, построенный с хвоста:");
        list.printList();
    }
}