public class RoyalGarden {
    private static int[][] stockBunga = {
        {10, 5, 15, 7},
        {6, 11, 9, 12},
        {2, 10, 10, 5},
        {5, 7, 12, 9}
    };

    private static int[] rincianHarga = {75000, 50000, 60000, 10000};

    public static void main(String[] args) {
        // Menampilkan pendapatan setiap cabang jika semua bunga habis terjual
        System.out.println("Pendapatan setiap cabang jika semua bunga habis terjual:");
        for (int i = 0; i < stockBunga.length; i++) {
            int pendapatan = 0;
            for (int j = 0; j < stockBunga[i].length; j++) {
                pendapatan += stockBunga[i][j] * rincianHarga[j];
            }
            System.out.println("Cabang " + (i + 1) + ": " + pendapatan);
        }

        // Mengetahui jumlah Stock setiap jenis bunga pada cabang royalgarden 4
        int cabang = 3; // cabang royalgarden 4 (indeks array dimulai dari 0)
        int[] penguranganStock = {-1, -2, 0, -5};
        System.out.println("\nJumlah Stock setiap jenis bunga pada cabang royalgarden 4:");
        for (int i = 0; i < stockBunga[cabang].length; i++) {
            int jumlahStock = stockBunga[cabang][i] + penguranganStock[i];
            System.out.println(getNamaBunga(i) + ": " + jumlahStock);
        }
    }

    private static String getNamaBunga(int index) {
        switch (index) {
            case 0:
                return "Aglonema";
            case 1:
                return "Keladi";
            case 2:
                return "Alocasia";
            case 3:
                return "Mawar";
            default:
                return "";
        }
    }
}
