import java.util.ArrayList;

public class HotelService {
    private ArrayList<Hotel> rooms;

    public HotelService() {
        rooms = new ArrayList<>();
    }

    public void tambah(Hotel h) {
        rooms.add(h);
    }

    public void tampilAll() {
        for (Hotel h : rooms) {
            System.out.println("Nama: " + h.getNama() + ", Kota: " + h.getKota() + ", Harga: " + h.getHarga() + ", Bintang: " + h.getBintang());
        }
    }

    public void bubbleSortHarga() {
        int n = rooms.size();
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (rooms.get(j).getHarga() > rooms.get(j + 1).getHarga()) {
                    Hotel temp = rooms.get(j);
                    rooms.set(j, rooms.get(j + 1));
                    rooms.set(j + 1, temp);
                }
            }
        }
    }

    public void selectionSortBintang() {
        int n = rooms.size();
        for (int i = 0; i < n - 1; i++) {
            int minIdx = i;
            for (int j = i + 1; j < n; j++) {
                if (rooms.get(j).getBintang() > rooms.get(minIdx).getBintang()) {
                    minIdx = j;
                }
            }
            Hotel temp = rooms.get(minIdx);
            rooms.set(minIdx, rooms.get(i));
            rooms.set(i, temp);
        }
    }
}
