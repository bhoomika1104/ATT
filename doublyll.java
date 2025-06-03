class DLLNode {
    int data;
    DLLNode prev;
    DLLNode next;

    DLLNode(int d) {
        data = d;
        prev = null;
        next = null;
    }
}

class DLL {
    DLLNode head;

    DLL() {
        head = null;
    }

    void insertAtHead(int data) {
        DLLNode newNode = new DLLNode(data);
        if (head != null) {
            head.prev = newNode;
            newNode.next = head;
        }
        head = newNode;
    }

    void insertAtTail(int data) {
        DLLNode newNode = new DLLNode(data);
        if (head == null) {
            head = newNode;
            return;
        }

        DLLNode temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newNode;
        newNode.prev = temp;
    }

    int size(DLLNode head) {
        int count = 0;
        DLLNode temp = head;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }

    void insertAtIndex(int data, int index) {
        if (index <= 0 || head == null) {
            insertAtHead(data);
            return;
        }

        int size = size(head);
        if (index > size) {
            System.out.println("Index out of bounds");
            return;
        }

        DLLNode newNode = new DLLNode(data);
        DLLNode temp = head;

        for (int i = 0; i < index - 1; i++) {
            temp = temp.next;
        }

        newNode.next = temp.next;
        if (temp.next != null) {
            temp.next.prev = newNode;
        }

        temp.next = newNode;
        newNode.prev = temp;
    }

    void deleteAtHead() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        if (head.next != null) {
            head = head.next;
            head.prev = null;
        } else {
            head = null;
        }
    }

    void deleteAtIndex(int index) {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        if (index < 0) {
            System.out.println("Index out of bounds");
            return;
        }

        if (index == 0) {
            deleteAtHead();
            return;
        }

        DLLNode temp = head;
        for (int i = 0; i < index; i++) {
            if (temp == null) {
                System.out.println("Index out of bounds");
                return;
            }
            temp = temp.next;
        }

        if (temp == null) {
            System.out.println("Index out of bounds");
            return;
        }

        if (temp.prev != null) {
            temp.prev.next = temp.next;
        }

        if (temp.next != null) {
            temp.next.prev = temp.prev;
        }
    }

    void deleteByVal(int value) {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        DLLNode temp = head;

        while (temp != null && temp.data != value) {
            temp = temp.next;
        }

        if (temp == null) {
            System.out.println("Value not found");
            return;
        }

        if (temp == head) {
            deleteAtHead();
            return;
        }

        if (temp.prev != null) {
            temp.prev.next = temp.next;
        }

        if (temp.next != null) {
            temp.next.prev = temp.prev;
        }
    }

    void printList() {
        DLLNode temp = head;
        while (temp != null) {
            System.out.print(temp.data + "<->");
            temp = temp.next;
        }
        System.out.println("NULL");
    }
}

public class Main {
    public static void main(String[] args) {
        DLL dll = new DLL();
        dll.insertAtHead(1);
        dll.insertAtHead(2);
        dll.insertAtHead(3);
        dll.insertAtTail(4);
        dll.insertAtTail(5);
        dll.insertAtTail(6);
        dll.insertAtIndex(7, 2);
        dll.insertAtIndex(8, 0);
        dll.insertAtIndex(9, 10); // Invalid
        dll.deleteByVal(7);
        dll.deleteAtIndex(3);
        dll.deleteAtHead();
        dll.printList();
    }
}
