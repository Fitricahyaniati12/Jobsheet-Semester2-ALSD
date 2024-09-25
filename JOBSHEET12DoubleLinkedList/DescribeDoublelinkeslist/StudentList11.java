public class StudentList11 {
    private Student11 head;
    private Student11 tail;
    private int size;

    public StudentList11() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }
    public int getSize() {
        return size;
    }
    

    public void addFromHead(String nim, String name, double gpa) {
        Student11 newStudent = new Student11(nim, name, gpa);
        if (head == null) {
            head = newStudent;
            tail = newStudent;
        } else {
            newStudent.next = head;
            head.prev = newStudent;
            head = newStudent;
        }
        size++;
    }

    public void addFromTail(String nim, String name, double gpa) {
        Student11 newStudent = new Student11(nim, name, gpa);
        if (tail == null) {
            head = newStudent;
            tail = newStudent;
        } else {
            tail.next = newStudent;
            newStudent.prev = tail;
            tail = newStudent;
        }
        size++;
    }

    public void addAtIndex(String nim, String name, double gpa, int index) {
        if (index < 0 || index > size) {
            System.out.println("Index out of bounds");
            return;
        }
        Student11 newStudent = new Student11(nim, name, gpa);
        if (index == 0) {
            addFromHead(nim, name, gpa);
            return;
        }
        if (index == size) {
            addFromTail(nim, name, gpa);
            return;
        }
        Student11 current = head;
        for (int i = 0; i < index - 1; i++) {
            current = current.next;
        }
        newStudent.next = current.next;
        newStudent.prev = current;
        current.next.prev = newStudent;
        current.next = newStudent;
        size++;
    }

    public void removeFromHead() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        if (head.next == null) {
            head = null;
            tail = null;
        } else {
            head = head.next;
            head.prev = null;
        }
        size--;
    }

    public void removeFromTail() {
        if (tail == null) {
            System.out.println("List is empty");
            return;
        }
        if (tail.prev == null) {
            head = null;
            tail = null;
        } else {
            tail = tail.prev;
            tail.next = null;
        }
        size--;
    }

    public void removeAtIndex(int index) {
        if (index < 0 || index >= size) {
            System.out.println("Index out of bounds");
            return;
        }
        if (index == 0) {
            removeFromHead();
            return;
        }
        if (index == size - 1) {
            removeFromTail();
            return;
        }
        Student11 current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        current.prev.next = current.next;
        current.next.prev = current.prev;
        size--;
    }

    public void printList() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        Student11 current = head;
        while (current != null) {
            System.out.println("NIM: " + current.nim + ",");
            System.out.println("Name: " + current.name + ",");
            System.out.println("GPA: " + current.gpa);
            System.out.println();
            current = current.next;
        }
    }
    
    public Student11 searchByNIM(String nim) {
        Student11 current = head;
        int nodeNumber = 1;
        while (current != null) {
            if (current.nim.equals(nim)) {
                System.out.println("Data " + nim + " is in node - " + nodeNumber);
                System.out.println("Identity :");
                System.out.println("NIM : " + current.nim);
                System.out.println("Name: " + current.name);
                System.out.println("GPA: " + current.gpa);
                return current;
            }
            current = current.next;
            nodeNumber++;
        }
        System.out.println("Data " + nim + " is not found");
        return null;
    }
    

    public void sortByGPADesc() {
        if (size <= 1) return;
        boolean swapped;
        do {
            swapped = false;
            Student11 current = head;
            while (current.next != null) {
                if (current.gpa < current.next.gpa) {
                    String tempNim = current.nim;
                    String tempName = current.name;
                    double tempGpa = current.gpa;
                    
                    current.nim = current.next.nim;
                    current.name = current.next.name;
                    current.gpa = current.next.gpa;
                    
                    current.next.nim = tempNim;
                    current.next.name = tempName;
                    current.next.gpa = tempGpa;
                    
                    swapped = true;
                }
                current = current.next;
            }
        } while (swapped);
    }
}
