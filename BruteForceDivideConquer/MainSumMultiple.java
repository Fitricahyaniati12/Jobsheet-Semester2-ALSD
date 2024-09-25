import java.util.Scanner;

public class MainSumMultiple {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah perusahaan: ");
        int numCompanies = sc.nextInt();
        
        double[][] keuntungan = new double[numCompanies][];
        for (int i = 0; i < numCompanies; i++) {
            System.out.print("Masukkan jumlah bulan keuntungan untuk perusahaan ke-" + (i + 1) + ": ");
            int numMonths = sc.nextInt();
            keuntungan[i] = new double[numMonths];
            for (int j = 0; j < numMonths; j++) {
                System.out.print("Masukkan keuntungan perusahaan ke-" + (i + 1) + " bulan ke-" + (j + 1) + ": ");
                keuntungan[i][j] = sc.nextDouble();
            }
        }

        System.out.println("===============================");
        System.out.println("Total keuntungan perusahaan:");
        for (int i = 0; i < numCompanies; i++) {
            Sum sm = new Sum(keuntungan[i].length);
            sm.keuntungan = keuntungan[i];
            System.out.println("Perusahaan ke-" + (i + 1) + ":");
            System.out.println("Total keuntungan dengan Brute Force: " + sm.totalBF(sm.keuntungan));
            System.out.println("Total keuntungan dengan Divide and Conquer: " + sm.totalDC(sm.keuntungan, 0, sm.keuntungan.length - 1));
            System.out.println("===============================");
        }
    }
}
