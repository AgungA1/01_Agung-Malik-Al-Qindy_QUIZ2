package Kuis_2;

public class DoubleLinkedList_01 {
    Node_01 head;
    int size;


    public DoubleLinkedList_01() {
        head = null;
        size = 0;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void addFirst(Pembeli_01 x, Pesanan_01 y) {
        if (isEmpty()) {
            head = new Node_01(null, x, y, null);
        } else {
            Node_01 newNode = new Node_01(null, x, y, head);
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }

    public void addLast(Pembeli_01 x, Pesanan_01 y) {
        if (isEmpty()) {
            addFirst(x, y);
        } else {
            Node_01 current = head;
            while (current.next != null) {
                current = current.next;
            }
            Node_01 newNode = new Node_01(current, x, y, null);
            current.next = newNode;
            size++;
        }
    }

    public int size() {
        return size;
    }

    public void clear() {
        head = null;
        size = 0;
    }

    public void print() {
        if (!isEmpty()) {
            Node_01 tmp = head;
            while (tmp != null) {
                System.out.println("Nomor Antrian : " + tmp.buyer.NoHp);
                System.out.println("Nama Customer : " + tmp.buyer.namaPembeli);
                System.out.println("Nomor Hp : " + tmp.buyer.NoHp);
                tmp = tmp.next;
            }
            System.out.println("\nTotal Antrian : " + size);
        } else {
            System.out.println("Linked Lists kosong");
        }
    }

    public void removeFirst() throws Exception {
        if (isEmpty()) {
            throw new Exception("Linked List masih kosong, tidak dapat dihapus");
        } else if (size == 1) {
            removeLast();
        } else {
            head = head.next;
            head.prev = null;
            size--;
        }
    }

    public void removeLast() throws Exception {
        if (isEmpty()) {
            throw new Exception("Linked List masih kosong, tidak dapat dihapus!");
        } else if (head.next == null) {
            head = null;
            size--;
            return;
        }
        Node_01 current = head;
        while (current.next.next != null) {
            current = current.next;
        }
        System.out.println("Nomor Antrian : " + current.order.kodePesanan);
        System.out.println("Nama Customer : " + current.order.namaPesanan);
        System.out.println("Nama Customer : " + current.order.harga);
        current.next = null;
        size--;
    }

    public void hitungPendapatan() {
        int total = 0;
        Node_01 current = head;
        while (current != null) {
            total = total + current.order.harga;
            current = current.next;
        }
        System.out.println("\nTotal Pendapatan = " + total);
    }

}
