/**
 * Sum
 */
public class Sum {

public int elemen;
public double keuntungan[];
public double total;

public Sum(int elemen) {
    this.elemen = elemen;
    this.keuntungan = new double[elemen];
    this.total = 0;
}
double totalBF(double arr[]) {
    for (int i = 0; i < elemen; i++) {
        total = total + arr[i];
    }
    return total;
}
double totalDC (double arr[], int l, int r){
    if (l == r)
        return arr[l];
    else if  (l<r){
        int  m= (l+r)/2;
        double lsum= totalDC(arr,l,m);
        double rsum= totalDC(arr,m+1,r);
        return lsum + rsum + arr[m];
    }
    return 0;
}
}