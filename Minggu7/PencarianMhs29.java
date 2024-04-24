package Minggu7;

public class PencarianMhs29 {
    Mahasiswa29 listMHs[] = new Mahasiswa29[5];
    int idx;

    public void tambah(Mahasiswa29 m) {
        if (idx < listMHs.length) {
            listMHs[idx] = m;
            idx++;
        } else {
            System.out.println("Data sudah penuh!!");
        }
    }

    public void tampil() {
        for (Mahasiswa29 m : listMHs) {
            if (m != null) {
                m.tampil();
            }
        }
    }

    public int FindBinarySearch(String cari, int left, int right) {
        if (right >= left) {
            int mid = left + (right - left) / 2;
            int cmp = cari.compareToIgnoreCase(listMHs[mid].nama);
            if (cmp == 0) {
                return mid;
            } else if (cmp < 0) {
                return FindBinarySearch(cari, left, mid - 1);
            } else {
                return FindBinarySearch(cari, mid + 1, right);
            }
        }
        return -1;
    }

    public void Tampilpoisisi(String x, int pos) {
        if (pos != -1) {
            System.out.println("Data dengan nama " + x + " ditemukan pada indeks " + pos);
        } else {
            System.out.println("Data dengan nama " + x + " tidak ditemukan");
        }
    }

    public void TampilData(String x, int pos) {
        if (pos != -1) {
            System.out.println("Data dengan nama " + x + ":");
            listMHs[pos].tampil();
        } else {
            System.out.println("Data dengan nama " + x + " tidak ditemukan");
        }
    }
}