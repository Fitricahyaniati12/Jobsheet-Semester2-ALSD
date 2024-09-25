public class Faktorial {
    public int nilai;

    public int faktorialBF(int n) {
        int fakto = 1;
        int i = 1;
        
        while (i <= n) {
            fakto *= i;
            i++;
       // for (int i = 1; i <= n; i++) {
            //fakto = fakto * i;
        }
        return fakto;
    }

    public int faktorialDC(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n * faktorialDC(n - 1);
        }
    }
}
