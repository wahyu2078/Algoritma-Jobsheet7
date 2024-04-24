package Minggu7;

public class Mahasiswa29 {
    int nim;
    String nama;
    int umur;
    double ipk;

    public Mahasiswa29(int ni, String n, int u, double i) {
        nim = ni;
        nama = n;
        umur = u;
        ipk = i;
    }

    public void tampil() {
        System.out.println("Nim: " + nim);
        System.out.println("Nama: " + nama);
        System.out.println("Umur: " + umur);
        System.out.println("IPK: " + ipk);
        System.out.println("---");
    }
}
