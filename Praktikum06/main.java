public class main {
    public static void main(String[] args) {
        int[] sortedNilai = {5, 5, 10, 20, 30, 40, 50};
        int index = Searching.binarySearch(sortedNilai, 5);

        if (index != -1) {
            System.out.println("Data ditemukan di indeks ke " + index);
        } else {
            System.out.println("Data tidak ditemukan");
        }
    }
}
