package Kuis_2;
import java.util.Scanner;
public class DoubleLinkedListMain {
    public static void menu() {
        System.out.println("\nPilih Menu:");
        System.out.println("1. Tambah Antrian");
        System.out.println("2. Cetak Antrian");
        System.out.println("3. Hapus Antrian");
        System.out.println("4. Laporan Pengurutan by Nama");
        System.out.println("5. Hitung total pendapatan");
        System.out.println("6. Keluar");
        System.out.println("-------------------");
    }

    public static void main(String[] args) throws Exception {
        System.out.println("======== QUIZ 2 PRAKTIKUM ASD TI - 1G ========");
        System.out.println("dibuat oleh : Agung Malik Al Qindy");
        System.out.println("NIM : 2141720114");
        System.out.println("Absen : 01");
        System.out.println("==============================================");
        System.out.println("Sistem Antrian Resto Royal Delish");

        DoubleLinkedList_01 dll = new DoubleLinkedList_01();
        Scanner input = new Scanner(System.in);
        while (true) {
            int no = input.nextInt();
            if (no == 1) {
                System.out.println("----------------------");
                System.out.println("Masukkan Data Pembeli");
                System.out.println("----------------------");
                System.out.print("Nomor Antrian : ");
                System.out.print(dll.size);
                System.out.println("Nama Customer : ");
                String nama = input.nextLine();
                System.out.println("Nomor hp : ");
                String noHp = input.nextLine();
                Pembeli_01 pembeli = new Pembeli_01(nama, noHp);
            }
        }
    }
}