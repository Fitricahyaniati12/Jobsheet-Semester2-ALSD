import java.util.Scanner;
public class Main11 {
    public static void main(String[] args) {
        Node11 point1 = new Node11("Apa warna langit?", "Biru");
        Node11 point2 = new Node11("Berapa jumlah kaki manusia?", "2");

        point1.setNext(point2);

        ScavengerHuntGame11 game = new ScavengerHuntGame11(point1);

        System.out.println("Selamat datang di Scavenger Hunt Game!\n");

        Scanner scanner = new Scanner(System.in);

        while (game.currentPoint != null) {
            System.out.println("Point:");
            System.out.println("Soal: " + game.currentPoint.getQuestion());
            System.out.println("Jawaban: " + game.currentPoint.getAnswer());

            System.out.print("\nJawaban untuk point saat ini: ");
            String answer = scanner.nextLine();

            game.moveToNextPoint(answer);
            System.out.println();
        }

        scanner.close();
    }
}
