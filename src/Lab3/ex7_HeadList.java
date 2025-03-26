package Lab3;
public class ex7_HeadList {
    static class Node {
        int data;
        Node next;

        public Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }
    }
    Node head; // Голова списка
    // Добавление в начало (с головы)
    public void addFirst(int data) {
        head = new Node(data, head);
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
        ex7_HeadList list = new ex7_HeadList();

        // Точки для отладки:
        list.addFirst(3); // Точка 1
        list.addFirst(2); // Точка 2
        list.addFirst(1); // Точка 3

        System.out.println("Список, построенный с головы:");
        list.printList();
    }
}