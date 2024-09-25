public class Queue11 {

    private Pasien[] antrian;
    private int front;
    private int rear;
    private int size;
    private int max;

    public Queue11(int n) {
        max = n;
        antrian = new Pasien[max];
        size = 0;
        front = rear = -1;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == max;
    }

    public void enqueue(Pasien p) {
        if (isFull()) {
            System.out.println("Antrian penuh");
            return;
        }
        if (isEmpty()) {
            front = rear = 0;
        } else {
            rear = (rear + 1) % max;
        }
        antrian[rear] = p;
        size++;
    }

    public Pasien dequeue() {
        if (isEmpty()) {
            System.out.println("Antrian kosong");
            return null;
        }
        Pasien p = antrian[front];
        if (front == rear) {
            front = rear = -1;
        } else {
            front = (front + 1) % max;
        }
        size--;
        return p;
    }

    public Pasien peek() {
        if (isEmpty()) {
            System.out.println("Antrian kosong");
            return null;
        }
        return antrian[front];
    }

    public Pasien peekRear() {
        if (isEmpty()) {
            System.out.println("Antrian kosong");
            return null;
        }
        return antrian[rear];
    }

    public int peekPosition(String nama) {
        for (int i = 0; i < max; i++) {
            if (antrian[i] != null && antrian[i].nama.equals(nama)) {
                return i + 1;
            }
        }
        return -1; // tidak ditemukan
    }

    public void daftarPasien() {
        if (isEmpty()) {
            System.out.println("Antrian kosong");
            return;
        }
        for (int i = front; i != rear; i = (i + 1) % max) {
            System.out.println(antrian[i]);
        }
        System.out.println(antrian[rear]);
    }
}
