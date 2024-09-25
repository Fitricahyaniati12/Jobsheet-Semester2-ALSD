class ScavengerHuntGame11 {
    Node11 currentPoint;

    public ScavengerHuntGame11(Node11 startingPoint) {
        currentPoint = startingPoint;
    }

    public void moveToNextPoint(String answer) {
        if (currentPoint.getAnswer().equalsIgnoreCase(answer)) {
            currentPoint = currentPoint.getNext();
            if (currentPoint != null) {
                System.out.println("Jawaban benar! Anda dapat melanjutkan ke point berikutnya.");
                System.out.println("Soal untuk point berikutnya: " + currentPoint.getQuestion());
            } else {
                System.out.println("Selamat, Anda telah menemukan harta karun!");
            }
        } else {
            System.out.println("Jawaban salah, coba lagi.");
        }
    }
}
