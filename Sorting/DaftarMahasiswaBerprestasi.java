//package minggu5;

public class DaftarMahasiswaBerprestasi {

    Mahasiswa11 listtMhs[] = new Mahasiswa11[5];
    int idx;

    void tambah(Mahasiswa11 m) {
        if (idx < listtMhs.length) {
            listtMhs[idx] = m;
            idx++;
            }else{
                System.out.println("Data sudah penuh");
            }
    }
    
    void tampil() {
        for(Mahasiswa11 m : listtMhs) {
            //if (m != null) {
                m.tampil();
                System.out.println("=================");
            }
        }
   // }  
    
   //void bubbleSort() {
   // for (int i = 0; i < idx - 1; i++) {
       // for (int j = 0; j < idx - i - 1; j++) {
         //   if (listtMhs[j].ipk < listtMhs[j + 1].ipk) {
                // Proses swap atau penukaran
           //     Mahasiswa11 temp = listtMhs[j];
             //   listtMhs[j] = listtMhs[j + 1];
               // listtMhs[j + 1] = temp;
           // }
       // }
   // }
//}
   // void selectionSort(){
     //   for (int i=0; i<listtMhs.length-1; i++){
       //     int idxMin = i;
         //   for (int j=i+1; j<listtMhs.length; j++){
           //     if(listtMhs[j].ipk <listtMhs[idxMin].ipk){
             //       idxMin = j;
               // }
        //    }
          //  Mahasiswa11 temp = listtMhs[idxMin];
            //listtMhs[idxMin] = listtMhs[i];
           // listtMhs[i] = temp;

          // void insertionSort(){
            //for (int i =1; i< listtMhs.length; i++) {
              //  Mahasiswa11 temp = listtMhs[i];
                //int j = i;
            //    while((j > 0) && (listtMhs[j-1].ipk > temp.ipk)){
              //      listtMhs [j] = listtMhs [j-1];
                //    j--;
                //}
                //listtMhs [j] =temp;
           // }
          // }
       // }
// descending
       void insertionSort() {
        for (int i = 1; i < idx; i++) {
            Mahasiswa11 key = listtMhs[i];
            int j = i - 1;
            while (j >= 0 && listtMhs[j].ipk < key.ipk) {
                listtMhs[j + 1] = listtMhs[j];
                j = j - 1;
            }
            listtMhs[j + 1] = key;
        }
    }
}
    