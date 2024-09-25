public class Student11 {
    String nim;
    String name;
    double gpa;
    Student11 next;
    Student11 prev;

    public Student11(String nim, String name, double gpa) {
        this.nim = nim;
        this.name = name;
        this.gpa = gpa;
        this.next = null;
        this.prev = null;
    }
}
