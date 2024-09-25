public class Akar {

    public double akarBruteForce(double bilangan) {
        double hasil = 1;
        double epsilon = 0.0001; // tingkat akurasi
        while (Math.abs(hasil * hasil - bilangan) > epsilon) {
            hasil = (hasil + bilangan / hasil) / 2;
        }
        return Math.floor(hasil); // pembulatan ke bawah
    }

    public double akarDivideConquer(double bilangan) {
        return Math.floor(akarDC(bilangan, 0, bilangan));
    }

    private double akarDC(double bilangan, double batasBawah, double batasAtas) {
        double epsilon = 0.0001; // tingkat akurasi
        double tengah = (batasAtas + batasBawah) / 2;
        if (Math.abs(tengah * tengah - bilangan) <= epsilon) {
            return tengah;
        } else if (tengah * tengah < bilangan) {
            return akarDC(bilangan, tengah, batasAtas);
        } else {
            return akarDC(bilangan, batasBawah, tengah);
        }
    }
}
