import java.util.Scanner;

public class MainAkar {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan bilangan : ");
        double bilangan = sc.nextDouble();

        Akar akar = new Akar();
        double akarBruteForce = akar.akarBruteForce(bilangan);
        double akarDivideConquer = akar.akarDivideConquer(bilangan);

        System.out.println("Akar dengan Brute Force: " + akarBruteForce);
        System.out.println("Akar dengan Divide and Conquer: " + akarDivideConquer);
    }
}
