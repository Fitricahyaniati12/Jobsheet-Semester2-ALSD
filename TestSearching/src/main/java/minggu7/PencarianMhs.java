package minggu7;

public class PencarianMhs {
    Mahasiswa listMHs[] = new Mahasiswa[5];
    int idx;

    void tambah(Mahasiswa m) {
        if (idx < listMHs.length) {
            listMHs[idx] = m;
            idx++;
        } else {
            System.out.println("Data sudah penuh !!");
        }
    }

    void tampil() {
        for (Mahasiswa m : listMHs) {
            if (m != null) {
                m.tampil();
                System.out.println("--------------------------");
            }
        }
    }

    public int FindBinarySearch(String cari, int left, int right) {
        if (right >= left) {
            int mid = left + (right - left) / 2;
            int result = cari.compareToIgnoreCase(listMHs[mid].nama);

            if (result == 0) {
                return mid;
            } else if (result < 0) {
                return FindBinarySearch(cari, left, mid - 1);
            } else {
                return FindBinarySearch(cari, mid + 1, right);
            }
        }
        return -1;
    }

    public void tampilHasilPencarian(String cari, int pos) {
        if (pos != -1) {
            System.out.println("Data dengan nama '" + cari + "' ditemukan pada indeks " + pos);
        } else {
            System.out.println("Data dengan nama '" + cari + "' tidak ditemukan");
        }
    }
}
