package Lab3;

public class ex8_Linked {
    private static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node head;
    private Node tail;

    // 1a. Итеративный ввод с головы
    public void createHead(int[] values) {
        for (int i = values.length - 1; i >= 0; i--) {
            addFirst(values[i]);
        }
    }

    // 1b. Итеративный ввод с хвоста
    public void createTail(int[] values) {
        for (int value : values) {
            addLast(value);
        }
    }

    // 2a. Итеративный вывод
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        Node current = head;
        while (current != null) {
            sb.append(current.data);
            if (current.next != null) {
                sb.append(" -> ");
            }
            current = current.next;
        }
        return sb.toString();
    }

    // 3a. Добавление в начало
    public void addFirst(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }

    // 3b. Добавление в конец
    public void addLast(int value) {
        Node newNode = new Node(value);
        if (tail == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    // 4. Вставка по индексу
    public void insert(int index, int value) {
        if (index < 0) throw new IndexOutOfBoundsException();
        if (index == 0) {
            addFirst(value);
            return;
        }

        Node current = head;
        for (int i = 0; i < index - 1; i++) {
            if (current == null) throw new IndexOutOfBoundsException();
            current = current.next;
        }

        if (current == null) throw new IndexOutOfBoundsException();

        Node newNode = new Node(value);
        newNode.next = current.next;
        current.next = newNode;

        if (newNode.next == null) {
            tail = newNode;
        }
    }

    // 5a. Удаление первого элемента
    public int removeFirst() {
        if (head == null) throw new IllegalStateException("List is empty");
        int value = head.data;
        head = head.next;
        if (head == null) {
            tail = null;
        }
        return value;
    }

    // 5b. Удаление последнего элемента
    public int removeLast() {
        if (head == null) throw new IllegalStateException("List is empty");

        if (head == tail) {
            int value = head.data;
            head = tail = null;
            return value;
        }

        Node current = head;
        while (current.next != tail) {
            current = current.next;
        }

        int value = tail.data;
        current.next = null;
        tail = current;
        return value;
    }

    // 5c. Удаление по индексу
    public int remove(int index) {
        if (index < 0 || head == null) throw new IndexOutOfBoundsException();
        if (index == 0) return removeFirst();

        Node current = head;
        for (int i = 0; i < index - 1; i++) {
            if (current.next == null) throw new IndexOutOfBoundsException();
            current = current.next;
        }

        if (current.next == null) throw new IndexOutOfBoundsException();

        int value = current.next.data;
        current.next = current.next.next;

        if (current.next == null) {
            tail = current;
        }

        return value;
    }

    // 6a. Рекурсивный ввод с головы
    public void createHeadRec(int[] values) {
        head = createHeadRecHelper(values, 0);
        // Обновляем tail
        tail = head;
        while (tail != null && tail.next != null) {
            tail = tail.next;
        }
    }

    private Node createHeadRecHelper(int[] values, int index) {
        if (index >= values.length) return null;
        Node newNode = new Node(values[index]);
        newNode.next = createHeadRecHelper(values, index + 1);
        return newNode;
    }

    // 6b. Рекурсивный ввод с хвоста
    public void createTailRec(int[] values) {
        head = createTailRecHelper(values, 0);
        // Обновляем tail
        tail = head;
        while (tail != null && tail.next != null) {
            tail = tail.next;
        }
    }

    private Node createTailRecHelper(int[] values, int index) {
        if (index >= values.length) return null;
        Node newNode = new Node(values[index]);
        if (index == values.length - 1) {
            return newNode;
        }
        newNode.next = createTailRecHelper(values, index + 1);
        return newNode;
    }

    // 6c. Рекурсивный вывод
    public String toStringRec() {
        return toStringRecHelper(head);
    }

    private String toStringRecHelper(Node node) {
        if (node == null) return "";
        if (node.next == null) return Integer.toString(node.data);
        return node.data + " -> " + toStringRecHelper(node.next);
    }

    // Тестирование
    public static void main(String[] args) {
        ex8_Linked list = new ex8_Linked();

        System.out.println("Итеративные методы:");
        list.createHead(new int[]{3, 2, 1});
        System.out.println("createHead: " + list);

        list = new ex8_Linked();
        list.createTail(new int[]{1, 2, 3});
        System.out.println("createTail: " + list);

        list.addFirst(0);
        System.out.println("addFirst(0): " + list);

        list.addLast(4);
        System.out.println("addLast(4): " + list);

        list.insert(2, 99);
        System.out.println("insert(2, 99): " + list);

        System.out.println("removeFirst(): " + list.removeFirst() + ", список: " + list);
        System.out.println("removeLast(): " + list.removeLast() + ", список: " + list);
        System.out.println("remove(2): " + list.remove(2) + ", список: " + list);

        System.out.println("\nРекурсивные методы:");
        list = new ex8_Linked();
        list.createHeadRec(new int[]{3, 2, 1});
        System.out.println("createHeadRec: " + list.toStringRec());

        list = new ex8_Linked();
        list.createTailRec(new int[]{1, 2, 3});
        System.out.println("createTailRec: " + list.toStringRec());
    }
}