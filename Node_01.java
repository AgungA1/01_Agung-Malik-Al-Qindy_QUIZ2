package Kuis_2;
public class Node_01 {
    Node_01 prev, next;
    Pembeli_01 buyer;
    Pesanan_01 order;


    Node_01(Node_01 prev, Pembeli_01 buyer, Pesanan_01 order, Node_01 next) {
        this.prev = prev;
        this.buyer = buyer;
        this.order = order;
        this.next = next;
    }
}
