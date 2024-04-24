package Minggu7;

import java.util.Scanner;

public class MahasiswaMain29 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Scanner sl = new Scanner(System.in);
        PencarianMhs29 data = new PencarianMhs29();

        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumMhs = s.nextInt();

        System.out.println("Masukkan data mahasiswa secara Urut dari Nama Terkecil:");
        for (int i = 0; i < jumMhs; i++) {
            System.out.println("==========================");
            System.out.print("Nim: ");
            int nim = s.nextInt();
            System.out.print("Nama: ");
            String nama = sl.nextLine();
            System.out.print("Umur: ");
            int umur = s.nextInt();
            System.out.print("IPK: ");
            double ipk = s.nextDouble();
            Mahasiswa29 m = new Mahasiswa29(nim, nama, umur, ipk);
            data.tambah(m);
        }
        System.out.println("==========================");
        System.out.println("Data keseluruhan Mahasiswa:");
        System.out.println("==========================");
        data.tampil();
        System.out.println("==========================");
        System.out.println("Pencarian Data:");
        System.out.println("Masukkan Nama Mahasiswa yang dicari:");
        System.out.print("Nama: ");
        String cari = sl.nextLine();
        System.out.println("==========================");
        System.out.println("Menggunakan binary Search");
        int posisi = data.FindBinarySearch(cari, 0, jumMhs - 1);

        data.Tampilpoisisi(cari, posisi);
        data.TampilData(cari, posisi);
    }
}